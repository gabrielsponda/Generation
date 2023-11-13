package modulo11;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " : ");
				matriz[i][j] = leia.nextInt();
			}
		}

		System.out.println("\nMatriz recebida: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.print("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
		}

		System.out.print("\nSoma dos Elementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			soma += matriz[i][i];
		}
		System.out.println(soma);

		soma = 0;
		System.out.print("Soma dos Elementos da Diagonal Secundária: ");
		for (int i = 0; i < 3; i++) {
			soma += matriz[i][2 - i];
		}
		System.out.println(soma);
	}
}
