package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antônio", "Vitor", "Samara"};
		
		float[] notas = new float[5];
		
		System.out.println("\nVetor 'pessoas' original:");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Posição " + (i + 1) + " = " + pessoas[i]);
		}
		
		Arrays.sort(pessoas);		
		System.out.println("\nVetor 'pessoas' ordenado em ordem 'crescente':");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Posição " + (i + 1) + " = " + pessoas[i]);
		}
		
		System.out.println("\nVetor 'pessoas' ordenado em ordem 'decrescente':");
		for (int i = pessoas.length - 1; i >= 0; i--) {
			System.out.println("Posição " + (i + 1) + " = " + pessoas[i]);
		}
		
		System.out.println("\nPosição do elemento 'Aline': " + Arrays.binarySearch(pessoas, "Aline") + "\n");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um valor para a posição " + i + ": ");
			notas[i] = leia.nextFloat();
		}
	}
}

// Um problema ocorreu com minha conexão e não consegui copiar o restante do código.
// Será atualizado em breve.