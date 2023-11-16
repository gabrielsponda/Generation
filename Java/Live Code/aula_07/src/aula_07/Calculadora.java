package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1, numero2, opcao;

		while (true) {

			System.out.println("\n1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");

			System.out.print("\nEscolha a operação matemática: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				sobre();
				System.exit(0);
			}

			System.out.print("\nDigite o primeiro número: ");
			numero1 = leia.nextInt();

			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextInt();

			switch (opcao) {

			case 1 -> System.out.println("\nSoma: " + somar(numero1, numero2));

			case 2 -> System.out.println("\nSubtração: " + subtrair(numero1, numero2));

			case 3 -> System.out.println("\nMultiplicação: " + multiplicar(numero1, numero2));

			case 4 -> System.out.println("\nDivisão: " + dividir(numero1, numero2));

			default -> System.out.println("\nOpção inválida!");

			}

		}

	}

	static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	static int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}

	static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	static int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}

	static void sobre() {
		System.out.println("\nCalculadora com Métodos");
		System.out.println("Feito por: Gabriel");
	}

}
