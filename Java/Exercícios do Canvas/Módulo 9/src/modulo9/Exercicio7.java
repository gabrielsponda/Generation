package modulo9;

import java.util.Scanner;

public class Exercicio7 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float numero1, numero2, resultado;
		int codigo;
		String operador;
		
		System.out.print("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.print("Operação: ");
		codigo = leia.nextInt();
		
		switch (codigo) {
		case 1: {
			resultado = numero1 + numero2;
			operador = "+";
			break;
		}
		case 2: {
			resultado = numero1 - numero2;
			operador = "-";
			break;
		}
		case 3: {
			resultado = numero1 * numero2;
			operador = "*";
			break;
		}
		case 4: {
			resultado = numero1 / numero2;
			operador = "/";
			break;
		}
		default:
			System.out.println("Código de operação inválido.");
			throw new IllegalArgumentException("Código de operação inválido.");
		}
		
		System.out.printf("%.1f %s %.1f = %.1f", numero1, operador, numero2, resultado);
	}
}
