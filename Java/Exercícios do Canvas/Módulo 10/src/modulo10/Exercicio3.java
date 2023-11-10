package modulo10;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, maior21 = 0, maior50 = 0;

		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		while (idade >= 0) {
			if (idade > 21)
				maior21++;
			if (idade > 50)
				maior50++;
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + maior21);
		System.out.println("Total de pessoas menores de 50 anos: " + maior50);
	}
}
