package modulo8;

import java.util.Scanner;

public class Atividade1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float salario;
		float abono;
		
		System.out.print("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("O novo salário é: %.2f", novoSalario);
	}
}
