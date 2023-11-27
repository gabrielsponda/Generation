package aula_11;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibindo dados da lista: ");
		for (var n : numeros)
			System.out.println(n);

		System.out.println("\nExibindo dados da lista: ");
		numeros.forEach(n -> System.out.println(n));

		System.out.println("\nExibindo dados da lista, mas dobrados: ");
		for (var n : numeros)
			System.out.println(n + n);

		System.out.println("\nExibindo dados da lista, mas dobrados: ");
		numeros.forEach(n -> System.out.println(n + n));

		System.out.println("\nExibindo todos elementos pares da lista: ");
		for (var n : numeros)
			if (n % 2 == 0)
				System.out.println(n);

		System.out.println("\nExibindo todos elementos pares da lista: ");
		numeros.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n + " é par");
		});

	}

}
