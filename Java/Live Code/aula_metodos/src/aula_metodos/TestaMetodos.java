package aula_metodos;

import static aula_metodos.pacote01.Classe02.*;

public class TestaMetodos {

	public static void main(String[] args) {

		// Chamada para os Métodos Locais
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();

		// Chamada para os Métodos da Classe 01
		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		// Classe01.metodoPrivado01();

		// Chamada para os Métodos da Classe 02
		metodoPublico02();
		// metodoFriendly02();
		// metodoProtegido02();
		// Classe01.metodoPrivado01();

	}

	public static void metodoPublico() {
		System.out.println("Método Público");
	}

	static void metodoFriendly() {
		System.out.println("M[etodo Friendly");
	}

	protected static void metodoProtegido() {
		System.out.println("Método Protegido");
	}

	private static void metodoPrivado() {
		System.out.println("Método Privado");
	}

}
