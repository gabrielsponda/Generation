package modulo9;

import java.util.Scanner;

public class Exercicio5 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int codigo, quantidade;
		String produto;
		float preco;
		
		System.out.print("Código do Produto: ");
		codigo = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1: {
			produto = "Cachorro Quente";
			preco = 10.00f;
			break;
		}
		case 2: {
			produto = "X-Salada";
			preco = 15.00f;
			break;
		}
		case 3: {
			produto = "X-Bacon";
			preco = 18.00f;
			break;
		}
		case 4: {
			produto = "Bauru";
			preco = 12.00f;
			break;
		}
		case 5: {
			produto = "Refrigerante";
			preco = 8.00f;
			break;
		}
		case 6: {
			produto = "Suco de laranja";
			preco = 13.00f;
			break;
		}
		default:
			System.out.println("Código de produto inválido.");
			throw new IllegalArgumentException("Código de produto inválido.");
		}
		
		System.out.println("Produto: " + produto);
		System.out.printf("Valor total: R$ %.2f", quantidade*preco);
	}
}
