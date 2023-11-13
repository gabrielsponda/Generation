package modulo10;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int continuar = 1, idade, sexo, categoria;
		int allBackend = 0, femaleFrontend = 0, maleMobile40M = 0, femaleFullStack30L = 0, all = 0, somaIdade = 0, mediaIdade = 0;

		while (continuar == 1) {
			System.out.print("\nDigite a Idade: ");
			idade = leia.nextInt();
			System.out.print("Digite o Sexo: ");
			sexo = leia.nextInt();
			System.out.print("Digite a Categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1)
				allBackend++;
			if (sexo == 1 || sexo == 4)
				if (categoria == 2)
					femaleFrontend++;
			if (sexo == 2 || sexo == 5)
				if (categoria == 3)
					if (idade > 40)
						maleMobile40M++;
			if (sexo == 3)
				if (categoria == 4)
					if (idade < 30)
						femaleFullStack30L++;
			
			all ++;
			somaIdade += idade;

			System.out.print("\nDeseja continuar (S/N): ");
			if (leia.next().toUpperCase().equals("N"))
				continuar = 0
				mediaIdade = somaIdade / all;
		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + allBackend);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + femaleFrontend);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + maleMobile40M);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + femaleFullStack30L);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " + all);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " + all);
	}
}
