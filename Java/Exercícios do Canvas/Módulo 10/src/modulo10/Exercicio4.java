package modulo10;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int continuar = 1, idade, sexo, categoria;
		int allBackend = 0, femaleFrontend = 0, maleMobile40M = 0, femaleFullStack30L = 0;

		while (continuar == 1) {
			System.out.print("\nDigite a Idade: ");
			idade = leia.nextInt();
			System.out.print("Digite o Sexo: ");
			sexo = leia.nextInt();
			System.out.print("Digite a Categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1)
				allBackend++;
			if (sexo == 2)
				if (categoria == 2)
					femaleFrontend++;
			if (sexo == 1)
				if (categoria == 3)
					if (idade > 40)
						maleMobile40M++;
			if (sexo == 2)
				if (categoria == 4)
					if (idade < 30)
						femaleFullStack30L++;

			System.out.print("\nDeseja continuar (S/N): ");
			if (leia.next().toUpperCase().equals("N"))
				continuar = 0;
		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + allBackend);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + femaleFrontend);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + maleMobile40M);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + femaleFullStack30L);
	}
}
