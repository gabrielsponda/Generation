package modulo9;

import java.util.Scanner;

public class Exercicio6 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome, cargo;
		int codigo;
		float salario, percentual;
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo: ");
		codigo = leia.nextInt();
		
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		case 1: {
			cargo = "Gerente";
			percentual = 1.10f;
			break;
		}
		case 2: {
			cargo = "Vendedor";
			percentual = 1.07f;
			break;
		}
		case 3: {
			cargo = "Supervisor";
			percentual = 1.09f;
			break;
		}
		case 4: {
			cargo = "Motorista";
			percentual = 1.06f;
			break;
		}
		case 5: {
			cargo = "Estoquista";
			percentual = 1.05f;
			break;
		}
		case 6: {
			cargo = "Técnico de TI";
			percentual = 1.08f;
			break;
		}
		default:
			System.out.println("Código de cargo inválido.");
			throw new IllegalArgumentException("Código de cargo inválido.");
		}
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f", salario*percentual);
	}
}
