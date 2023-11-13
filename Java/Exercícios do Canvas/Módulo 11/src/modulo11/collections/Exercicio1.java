package modulo11.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 cores, uma por linha:");
		for (int i = 0; i < 5; i++) {
			cores.add(leia.nextLine());
			cores.set(i, cores.get(i).toLowerCase());
		}

		System.out.println("\nListar todas as cores:");
		for (String cor : cores)
			System.out.println(cor);

		System.out.println("\nOrdenar as cores:");
		cores.sort(null);
		for (String cor : cores)
			System.out.println(cor);
	}
}