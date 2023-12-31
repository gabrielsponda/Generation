package com.generation.gamestore.repostiory;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamestore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findByNomeContainingIgnoreCase(@Param("nome") String nome); // SELECT * FROM tb_produtos WHERE nome LIKE %?1%
	
	public List<Produto> findByPrecoLessThan(BigDecimal preco); // SELECT * FROM tb_produtos WHERE preco < ?1
	
	public List<Produto> findByPrecoGreaterThan(BigDecimal preco); // SELECT * FROM tb_produtos WHERE preco > ?1
}
