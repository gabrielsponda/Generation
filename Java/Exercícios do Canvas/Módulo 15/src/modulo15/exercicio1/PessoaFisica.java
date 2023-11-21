package modulo15.exercicio1;

public class PessoaFisica extends Cliente {
	
	private int cpf;

	public PessoaFisica(int id, String nome, String email, int telefone, String endereco, int cpf) {
		super(id, nome, email, telefone, endereco);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.print("\nCPF: " + this.getCpf());
		System.out.println("\n");
	}
}
