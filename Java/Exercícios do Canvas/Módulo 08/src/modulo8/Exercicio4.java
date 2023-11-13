package modulo8;

import java.util.Scanner;

public class Exercicio4 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float n1, n2, n3, n4;
		
		System.out.print("numero1: ");
		n1 = leia.nextFloat();
		
		System.out.print("numero2: ");
		n2 = leia.nextFloat();
		
		System.out.print("numero3: ");
		n3 = leia.nextFloat();
		
		System.out.print("numero4: ");
		n4 = leia.nextFloat();
		
		System.out.printf("Diferença: %.1f", ((n1 * n2) - (n3 * n4)));
	}
}
