package modulo15.exercicio2;

public class Vendedor extends Funcionario {
	
	float meta;

	public Vendedor(int id, String nome, int cargo, String admissao, float salario, float meta) {
		super(id, nome, cargo, admissao, salario);
		this.meta = meta;
	}
	
	public float getMeta() {
		return meta;
	}

	public void setMeta(float meta) {
		this.meta = meta;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("\nMeta mensal: %.2f", this.getMeta());
		System.out.println("\n");
	}

}
