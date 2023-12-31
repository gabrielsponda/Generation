package com.generation.gamestore.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.gamestore.model.Produto;
import com.generation.gamestore.repostiory.CategoriaRepository;
import com.generation.gamestore.repostiory.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id) {
		return produtoRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getByTitulo(@PathVariable String nome) {
		return ResponseEntity.ok(produtoRepository.findByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/precosmenores/{preco}")
	public ResponseEntity<List<Produto>> getByPrecoMenor(@PathVariable BigDecimal preco) {
		return ResponseEntity.ok(produtoRepository.findByPrecoLessThan(preco));
	}
	
	@GetMapping("/precosmaiores/{preco}")
	public ResponseEntity<List<Produto>> getByPrecoMaior(@PathVariable BigDecimal preco) {
		return ResponseEntity.ok(produtoRepository.findByPrecoGreaterThan(preco));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@Valid @RequestBody Produto produto) {

		if (categoriaRepository.existsById(produto.getCategoria().getId()))
			return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
		
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria inexistente.", null);
	}
	
	@PutMapping
	public ResponseEntity<Produto> update(@Valid @RequestBody Produto produto) {
		
		if (produtoRepository.existsById(produto.getId())) {
			if (categoriaRepository.existsById(produto.getCategoria().getId())) 
				return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
		
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria inexistente.", null);
		}
			
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);

		produtoRepository.deleteById(id);
	}
	
}
