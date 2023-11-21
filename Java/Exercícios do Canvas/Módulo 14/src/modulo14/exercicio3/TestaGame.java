package modulo14.exercicio3;

public class TestaGame {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Campo Minado", 1, 1, 0, 30.00f);
		Produto produto2 = new Produto("Tomb Raider", 2, 2, 12, 200.00f);
		
		produto1.visualizar();
		produto2.visualizar();
		
	}

}
