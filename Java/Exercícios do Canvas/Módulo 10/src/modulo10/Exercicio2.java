package modulo10;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, pares = 0, impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
	}
}
