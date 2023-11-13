package modulo11;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float[][] matriz = new float[10][4];
		float[] vetor = new float[10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite a nota " + (j + 1) + " do participante " + (i + 1) + ": ");
				matriz[i][j] = leia.nextFloat();
			}
			System.out.print("\n");
		}

		for (int i = 0; i < 10; i++) {
			float soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += matriz[i][j];
			}
			vetor[i] = soma / 4.0f;
		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
	}
}
