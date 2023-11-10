package modulo9;

import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int A, B, C;
		
		System.out.print("Digite o número A: ");
		A = leia.nextInt();
		System.out.print("Digite o número B: ");
		B = leia.nextInt();
		System.out.print("Digite o número C: ");
		C = leia.nextInt();
		
		if (A + B > C) {
			System.out.printf("\n%d + %d = %d > %d\n", A, B, A+B, C);
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if (A + B == C) {
			System.out.printf("\n%d + %d = %d = %d\n", A, B, A+B, C);
			System.out.println("A Soma de A + B é Igual a C");
		}
		else {
			System.out.printf("\n%d + %d = %d < %d\n", A, B, A+B, C);
			System.out.println("A Soma de A + B é Menor do que C");
		}
	}
}
