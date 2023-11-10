package modulo10;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1, numero2;

		System.out.print("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();

		System.out.print("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero2 < numero1)
			System.out.println("Intervalo inválido!");
		else {
			do {
				if (numero1 % 3 == 0)
					if (numero1 % 5 == 0)
						System.out.println(numero1 + " é múltiplo de 3 e 5");
				numero1 += 1;
			} while (numero1 < numero2);
		}
	}
}
