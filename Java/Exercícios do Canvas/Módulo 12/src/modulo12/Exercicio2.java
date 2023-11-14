package modulo12;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		Stack<String> pilha = new Stack<String>();
		Iterator<String> iterator = pilha.iterator();
		String nome;

		do {
			System.out.println("\n******************************");
			System.out.println("");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("******************************");
			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();
			leia.skip("\\R");

			switch (opcao) {
			case 1: {
				System.out.print("\nDigite o nome: ");
				nome = leia.nextLine();
				pilha.add(nome);

				System.out.println("\nPilha:\n");
				iterator = pilha.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());

				System.out.println("\nLivro Adicionado!");

				break;
			}
			case 2: {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
					break;
				}

				System.out.println("\nLista de Livros na Pilha:\n");
				iterator = pilha.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());

				break;
			}
			case 3: {
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
					break;
				}

				pilha.pop();

				System.out.println("\nPilha:\n");
				iterator = pilha.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());

				System.out.println("\nUm Livro foi retirado da pilha!");

				break;
			}
			case 0: {
				System.out.println("\nPrograma Finalizado!");

				break;
			}
			default:
				System.out.println("\nOpção inválida!");

				break;
			}
		} while (opcao != 0);
	}
}