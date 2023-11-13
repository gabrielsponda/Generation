package modulo11.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		int procurado;

		System.out.println("Digite 10 números, um por linha:");
		for (int i = 0; i < 10; i++) {
			numeros.add(leia.nextInt());
		}

		System.out.print("\nList: ");
		for (int numero : numeros)
			System.out.print(numero + " ");

		System.out.print("\n\nDigite o número que você deseja encontrar: ");
		procurado = leia.nextInt();

		if (numeros.contains(procurado))
			System.out.println("O número " + procurado + " foi encontrado!");
		else
			System.out.println("O número 40 não foi encontrado!");
	}
}