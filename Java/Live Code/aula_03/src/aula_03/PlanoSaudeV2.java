package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String nome;
		int faixa;
		float valor;

		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Faixas Etárias: ");
		System.out.println("1 - De 0 a 10 anos");
		System.out.println("2 - de 11 a 29 anos");
		System.out.println("3 - de 30 a 45 anos");
		System.out.println("4 - de 46 a 59 anos");
		System.out.println("5 - de 60 a 65 anos");
		System.out.println("6 - Acima de 65 anos");

		System.out.print("Digite sua faixa etária: ");
		faixa = leia.nextInt();

		switch (faixa) {
		case 1: {
			valor = 100.00f;
			break;
		}
		case 2: {
			valor = 200.00f;
			break;
		}
		case 3: {
			valor = 300.00f;
			break;
		}
		case 4: {
			valor = 500.00f;
			break;
		}
		case 5: {
			valor = 600.00f;
			break;
		}
		case 6: {
			valor = 1000.00f;
			break;
		}
		default:
			System.out.printf("Faixa etária inválida.");
			throw new IllegalArgumentException("Faixa etária inválida.");
		}

		System.out.printf("%s, seu plano de saúde custará R$ %.2f por mês.", nome, valor);
	}
}
