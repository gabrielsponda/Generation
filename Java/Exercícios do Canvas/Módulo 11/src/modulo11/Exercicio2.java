package modulo11;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o elemento " + i + ": ");
			numeros[i] = leia.nextInt();
		}

		System.out.print("\nElementos nos índices ímpares: ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				System.out.print(numeros[i] + " ");
		}

		System.out.print("\nElementos pares: ");
		for (int i = 0; i < 10; i++) {
			if (numeros[i] % 2 == 0)
				System.out.print(numeros[i] + " ");
		}

		for (int i = 0; i < 10; i++)
			soma += numeros[i];
		System.out.println("\nSoma: " + soma);

		System.out.printf("Média: %.2f", ((float) soma / 10));
	}
}
