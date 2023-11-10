package modulo9;

import java.util.Scanner;

public class Exercicio4 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String filo, classe, ordem;
		
		filo = leia.nextLine();
		classe = leia.nextLine();
		ordem = leia.nextLine();
		
		if (filo.equalsIgnoreCase("vertebrado"))
			if (classe.equalsIgnoreCase("ave"))
				if (ordem.equalsIgnoreCase("carnívoro"))
					System.out.println("Águia");
				else
					System.out.println("Pomba");
			else
				if (ordem.equalsIgnoreCase("onívoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
		else 
			if (classe.equalsIgnoreCase("inseto"))
				if (ordem.equalsIgnoreCase("hematófago"))
					System.out.println("Pulga");
				else
					System.out.println("Lagarta");
			else
				if (ordem.equalsIgnoreCase("hematófago"))
					System.out.println("Sanguessuga");
				else
					System.out.println("Minhoca");
	}
}
