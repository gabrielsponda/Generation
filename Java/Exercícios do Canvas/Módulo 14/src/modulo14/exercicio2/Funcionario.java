package modulo14.exercicio2;

public class Funcionario {

	private int id;
	private String nome;
	private int cargo;
	private String admissao;
	private float salario;

	public Funcionario(int id, String nome, int cargo, String admissao, int salario) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.admissao = admissao;
		this.salario = salario;
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

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void visualizar() {

		String cargo = "";

		switch (this.getCargo()) {
		case 1 -> cargo = "Assistente Administrativo";
		case 2 -> cargo = "Analista Financeiro";
		case 3 -> cargo = "Gerente";
		}

		System.out.print("DADOS DO FUNCIONÁRIO");
		System.out.print("\nID: " + this.getId());
		System.out.print("\nNome: " + this.getNome());
		System.out.print("\nCargo: " + cargo);
		System.out.print("\nData de admissão: " + this.getAdmissao());
		System.out.printf("\nSalário: %2.f", this.getSalario());
		System.out.println("\n");
		
	}

}
