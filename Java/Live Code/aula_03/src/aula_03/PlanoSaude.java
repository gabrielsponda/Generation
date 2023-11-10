package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		float valor;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
				
		System.out.print("Informe sua idade: ");
		idade = leia.nextInt();
		
		if (idade > 0 && idade <=10)
			valor = 100.00f;
		if (idade < 30)
			valor = 200.00f;
		if (idade <= 45)
			valor = 300.00f;
		if (idade < 60)
			valor = 500.00f;
		if (idade <= 65)
			valor = 600.00f;
		else
			valor = 1000.00f;
		
		System.out.printf("%s, seu plano de saúde custará R$ %.2f por mês.", nome, valor);
	}
}
