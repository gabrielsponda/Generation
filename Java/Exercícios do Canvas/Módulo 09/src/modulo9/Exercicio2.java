package modulo9;

import java.util.Scanner;

public class Exercicio2 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		Boolean par = false, positivo = false;
		
		System.out.print("Digite um número: ");
		n = leia.nextInt();
		
		if (n%2 == 0)
			par = true;
		if (n >= 0)
			positivo = true;
		
		if (par && positivo)
			System.out.printf("O Número %d é par e positivo!", n);
		if (!par && !positivo)
			System.out.printf("O Número %d é ímpar e negativo!", n);
		if (par && !positivo)
			System.out.printf("O Número %d é par e negativo!", n);
		if (!par && positivo)
			System.out.printf("O Número %d é ímpar e positivo!", n);
	}
}
