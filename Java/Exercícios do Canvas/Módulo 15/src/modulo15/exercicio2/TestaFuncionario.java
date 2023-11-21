package modulo15.exercicio2;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Gerente funcionario1 = new Gerente(1, "Gabriel", 2, "26/10/2023", 30000.00f, "Generation");
		Vendedor funcionario2 = new Vendedor(2, "Rafael", 3, "01/02/2015", 30000.00f, 10000.00f);
		
		funcionario1.visualizar();
		funcionario2.visualizar();
		
	}
	
}
