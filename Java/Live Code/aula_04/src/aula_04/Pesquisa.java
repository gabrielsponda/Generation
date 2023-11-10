package aula_04;

import java.util.Scanner;

public class Pesquisa {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolL18 = 0, outros = 0;

		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Digite o seu Esporte favorito (1-Fut / 2-Vol / 3-Basq / 4-Outros): ");
			esporte = leia.nextInt();

			// Quantas pessoas gostam de futebol
			if (esporte == 1)
				futebol++;

			// Quantas pessoas gostam de voleibol e são maiores de 18 anos
			if (esporte == 2 && idade > 18)
				voleibolM18++;

			// Quantas pessoas gostam de basquetebol e são menores de 18 anos
			if (esporte == 2 && idade < 18)
				basquetebolL18++;

			// Quantas pessoas gostam de outros esportes
			if (esporte == 4)
				outros++;

			System.out.print("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}

		System.out.println("\nTotal de pessoas que gostam de futebol: " + futebol);
		System.out.println("\nTotal de pessoas que gostam de voleibol e são maiores de 18 anos: " + voleibolM18);
		System.out.println("\nTotal de pessoas que gostam de basquetebol e são menores de 18 anos: " + basquetebolL18);
		System.out.println("\nTotal de pessoas que gostam de outros esportes: " + outros);
	}
}
