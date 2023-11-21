package modulo15.exercicio1;

public class PessoaJuridica extends Cliente {
	
	private int cnpj;

	public PessoaJuridica(int id, String nome, String email, int telefone, String endereco, int cnpj) {
		super(id, nome, email, telefone, endereco);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.print("\nCNPJ: " + this.getCnpj());
		System.out.println("\n");
	}

}
