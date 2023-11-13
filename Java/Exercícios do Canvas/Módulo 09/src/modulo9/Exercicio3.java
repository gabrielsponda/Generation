package modulo9;

import java.util.Scanner;

public class Exercicio3 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		Boolean primeira, apto = false;
		
		System.out.print("Digite o Nome do doardor: ");
		nome = leia.nextLine();
		System.out.print("Digite a Idade do doardor: ");
		idade = leia.nextInt();
		System.out.print("Primeira doação de sangue? [true/false] ");
		leia.nextLine(); //  Limpa o buffer
		if (leia.nextLine().equalsIgnoreCase("true"))
			primeira = true;
		else
			primeira = false;
		
		if (idade >= 18 && idade < 60)
			apto = true;
		if (idade >= 60 && idade < 70)
			if (primeira == false)
				apto = true;
		
		if (apto == true)
			System.out.printf("%s está apto(a) para doar sangue!", nome);
		else
			System.out.printf("%s não está apto(a) para doar sangue!", nome);
	}
}
