package modulo8;

import java.util.Scanner;

public class Atividade3 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + horasExtras * 5 - descontos;
		
		System.out.printf("Salario Líquido: %.2f", salarioLiquido);
	}
}
