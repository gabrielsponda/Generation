package modulo15.exercicio2;

public class Gerente extends Funcionario {
	
	String loja;

	public Gerente(int id, String nome, int cargo, String admissao, float salario, String loja) {
		super(id, nome, cargo, admissao, salario);
		this.loja = loja;
	}
	
	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.print("\nLoja: " + this.getLoja());
		System.out.println("\n");
	}

}
