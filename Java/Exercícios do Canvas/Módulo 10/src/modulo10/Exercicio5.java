package modulo10;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, soma = 0;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		do {
			if (numero > 0)
				soma += numero;
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é: " + soma);
	}
}
