package modulo11.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int procurado;

		System.out.println("Digite 10 números, um por linha:");
		for (int i = 0; i < 10; i++) {
			numeros.add(leia.nextInt());
		}

		System.out.print("\nList: ");
		for (int numero : numeros)
			System.out.print(numero + " ");

		System.out.print("\nDigite o número que você deseja encontrar: ");
		procurado = leia.nextInt();

		if (numeros.contains(procurado))
			System.out.println("O número " + procurado + " está localizado na posição: " + numeros.indexOf(procurado));
		else
			System.out.println("O número " + procurado + " não foi encontrado!");
	}
}