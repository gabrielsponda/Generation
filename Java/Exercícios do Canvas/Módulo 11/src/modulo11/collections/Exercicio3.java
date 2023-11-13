package modulo11.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		System.out.println("Digite 10 números, um por linha:");
		for (int i = 0; i < 10; i++) {
			numeros.add(leia.nextInt());
		}

		System.out.println("\nListar dados do Set:");

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext())
			System.out.println(iNumeros.next());
	}
}