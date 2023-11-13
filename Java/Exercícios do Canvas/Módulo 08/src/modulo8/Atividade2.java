package modulo8;

import java.util.Scanner;

public class Atividade2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float[] nota = new float[4];
		float soma = 0, media;
	
		for (int i = 0; i < 4; i++) {
			System.out.printf("Nota %d: ", i+1);
			nota[i] = leia.nextFloat();
			soma += nota[i];
		}
		
		media = soma/4;
		
		System.out.printf("Média final: %.1f", media);
	}
}
