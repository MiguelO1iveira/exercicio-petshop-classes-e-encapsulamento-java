package exercicio_03;

import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		menu();
	}
	
	
	private static int menu() {
		Scanner scanner = new Scanner(System.in);
		int op;
		
		
		System.out.println("+=============================+");
		System.out.println("|   PETSHOP MIGUEL OLIVEIRA   |");
		System.out.println("+=============================+");
		System.out.println("| [1] Colocar Pet na Máquina  |");
		System.out.println("| [2] Remover Pet da Máquina  |");
		System.out.println("| [3] Dar Banho               |");
		System.out.println("| [4] Abastecer com água      |");
		System.out.println("| [5] Abastecer com Shampoo   |");
		System.out.println("| [6] Nível de Água           |");
		System.out.println("| [7] Nível de Shampoo        |");
		System.out.println("| [8] Ver quem está na máquna |");
		System.out.println("+=============================+");
		System.out.print(">>> ");
		op = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		return op;
	}
	

}
