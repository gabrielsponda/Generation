package modulo15.exercicio1;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private int telefone;
	private String endereco;
	
	public Cliente(int id, String nome, String email, int telefone, String endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
		String telefone = String.valueOf(this.getTelefone());
		System.out.print("DADOS DO CLIENTE");
		System.out.print("\nID: " + this.getId());
		System.out.print("\nNome: " + this.getNome());
		System.out.print("\nE-mail: " + this.getEmail());
		System.out.print("\nTelefone: " + telefone.substring(0, 5) + "-" + telefone.substring(5, 9));
		System.out.print("\nEndereço: " + this.getEndereco());
	}
	
}
