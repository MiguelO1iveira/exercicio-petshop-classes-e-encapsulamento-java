package exercicio_03;

public class Main {

	public static void main(String[] args) {
		Pet dog = new Pet("Bob");
		Pet cat = new Pet("Simba");
		PetMachine machine01 = new PetMachine();
		
		for (int i = 1; i <= 15; i++) {
			machine01.waterSupply();
		}
		for (int i = 1; i <= 5; i++) {
			machine01.refillShampoo();
		}
		
		machine01.removeFromTheShower(dog);
		machine01.putInTheShower(dog);
		machine01.removeFromTheShower(dog);
		machine01.putInTheShower(cat);
		
		
		machine01.inUse();
		machine01.bathe();
		machine01.removeFromTheShower(dog);
		machine01.checkWater();
		machine01.checkShampoo();
	}

}
