package modulo14.exercicio3;

public class Produto {
	
	private String titulo;
	private int plataforma;
	private int genero;
	private int classificacao;
	private float preco;
	
	public Produto(String titulo, int plataforma, int genero, int classificacao, float preco) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.genero = genero;
		this.classificacao = classificacao;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {

		String plataforma = "";
		String genero = "";

		switch (this.getPlataforma()) {
		case 1 -> plataforma = "PC";
		case 2 -> plataforma = "PS5";
		case 3 -> plataforma = "Xbox";
		}
		
		switch (this.getGenero()) {
		case 1 -> genero = "Ação";
		case 2 -> genero = "Aventura";
		case 3 -> genero = "Estratégia";
		}

		System.out.print("DADOS DO FUNCIONÁRIO");
		System.out.print("\nTítulo: " + this.getTitulo());
		System.out.print("\nPlataforma: " + plataforma);
		System.out.print("\nGênero: " + genero);
		System.out.print("\nClassificação etária: " + this.getClassificacao());
		System.out.printf("\nPreço: %.2f", this.getPreco());
		System.out.println("\n");
		
	}
	
}
