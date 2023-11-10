package modulo10;

import java.util.Scanner;

public class Exercicio6 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, soma = 0, contador = 0;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		do {
			if (numero % 3 == 0) {
				soma += numero;
				contador++;
			}
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
		} while (numero != 0);

		System.out.printf("\nA soma dos números positivos é: %.1f", (float) soma / (float) contador);
	}
}
