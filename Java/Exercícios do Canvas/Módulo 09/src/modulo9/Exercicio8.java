package modulo9;

import java.util.Scanner;

public class Exercicio8 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double saldo = 1000.00, valor = 0;
		int codigo;
		
		System.out.print("Operação: ");
		codigo = leia.nextInt();
		if (codigo != 1) {
			System.out.print("Valor: R$ ");
			valor = leia.nextDouble();
		}
		
		switch (codigo) {
		case 1: {
			System.out.println("\nOperação - Saldo");
			valor = saldo;
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		}
		case 2: {
			System.out.println("\nOperação - Saque");
			if (valor > saldo) {
				System.out.println("Saldo Insuficiente!");
				break;
			}
			else {
				saldo -= valor;
				System.out.printf("Novo Saldo: R$ %.2f", saldo);
				break;
			}
		}
		case 3: {
			System.out.println("\nOperação - Depósito");
			saldo += valor;
			System.out.printf("Novo Saldo: R$ %.2f", saldo);
			break;
		}
		default:
			System.out.println("Operação Inválida!");
			throw new IllegalArgumentException("Operação Inválida!");
		}
	}
}
