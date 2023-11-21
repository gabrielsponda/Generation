package modulo15.exercicio1;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		PessoaFisica cliente1 = new PessoaFisica(1, "Gabriel", "gabriel@email.com", 999009900, "Rua Baker, 221", 1234567890);
		PessoaJuridica cliente2 = new PessoaJuridica(2, "Rafael", "rafael@email.com", 912345678, "Rua Generation, 10", 987654321);
		
		cliente1.visualizar();
		cliente2.visualizar();
		
	}
	
}
