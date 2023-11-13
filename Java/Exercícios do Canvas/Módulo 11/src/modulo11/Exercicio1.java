package modulo11;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int procurado;
		Boolean encontrado = false;

		System.out.println(numeros);

		System.out.print("Digite o número que você deseja encontrar: ");
		procurado = leia.nextInt();

		for (int i = 0; i < 10; i++) {
			if (numeros[i] == procurado) {
				System.out.println("O número " + procurado + " está localizado na posição: " + i);
				encontrado = true;
			}
		}

		if (encontrado == false)
			System.out.println("O número " + procurado + " não foi encontrado!");
	}
}
