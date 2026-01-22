package exercicio_03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		menu();
		
	}
	
	
	private static void menu() {
		Pet pet = new Pet("Bob");
		PetMachine machine01 = new PetMachine();
		
		int option;
		
		try (Scanner scanner = new Scanner(System.in)) {
			do {
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
				System.out.println("| [9] Limpar a máquna         |");
				System.out.println("| [0] Sair                    |");
				System.out.println("+=============================+");
				System.out.print(">>> ");
				option = Integer.parseInt(scanner.nextLine());
				
				switch(option) {
					case 0 -> System.out.println("Encerrando...");
					case 1 -> machine01.putInTheShower(pet);
					case 2 -> machine01.removeFromTheShower(pet);
					case 3 -> machine01.bathe();
					case 4 -> machine01.waterSupply();
					case 5 -> machine01.refillShampoo();
					case 6 -> machine01.checkWater();
					case 7 -> machine01.checkShampoo();
					case 8 -> machine01.inUse();
					case 9 -> machine01.cleanMachine();
				}
				pause(scanner);
				
			} while(option != 0);	
		
		} // TRY
		
	} // MENU()
	
	public static void pause(Scanner scanner) {
		
		scanner.nextLine();
		
		 for (int i = 0; i < 30; i++) {
			    System.out.println();
			}
	}
	
} //MAIN
