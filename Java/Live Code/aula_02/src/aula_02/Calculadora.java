package aula_02;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		double numero1, numero2;

		System.out.print("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		System.out.print("Digite o segundo numero: ");
		numero2 = leia.nextDouble();

		System.out.println("\nSoma: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 - numero2));
		System.out.println("Multiplicação: " + (numero1 * numero2));
		
		// Condição para realizar a divisão
		if (numero2 != 0) {
			System.out.println("Divisão: " + (numero1 / numero2));
		} else {
			System.out.println("O numero2 é 0 e não pode ser denominador.");
		}
		
		System.out.println("Módulo do numero 1(Resto da divisão): " + (numero1 % 2));
		System.out.println("Módulo do numero2 (Resto da divisão): " + (numero1 % 2));
		System.out.println("Raiz quadrada do numero1: " + (Math.sqrt(numero1)));
		System.out.println("Potenciação do numero1 pelo numero2: " + Math.pow(numero1, numero2));
	}

}
