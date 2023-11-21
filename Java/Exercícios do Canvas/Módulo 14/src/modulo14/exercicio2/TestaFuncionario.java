package modulo14.exercicio2;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(1, "Gabriel", 2, "26/10/2023", 30000);
		Funcionario funcionario2 = new Funcionario(2, "Rafael", 3, "01/02/2015", 10000);
		
		funcionario1.visualizar();
		funcionario2.visualizar();
		
	}
	
}
