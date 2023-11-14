package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();
		Double numero;

		System.out.print("Digite uma nota: ");
		numero = leia.nextDouble();

		notas.add(numero);

		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);

		for (var nota : notas)
			System.out.println(nota);

		System.out.println(notas);

		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));

		System.out.println("Existe o elemento 7? " + notas.contains(7.0));

		System.out.println("Elemento na posição 1: " + notas.get(1));

		notas.remove(3);
		
		notas.forEach(System.out::println);
		
		notas.clear();
		
		System.out.println("A Lista está vazia? " + notas.isEmpty());
	}
}