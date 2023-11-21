package modulo14.exercicio1;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1, "Gabriel", "gabriel@email.com", 999009900, "Rua Baker, 221");
		Cliente cliente2 = new Cliente(2, "Rafael", "rafael@email.com", 912345678, "Rua Generation, 10");
		
		cliente1.visualizar();
		cliente2.visualizar();
		
	}
	
}
