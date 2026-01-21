package exercicio_03;

public class PetMachine {
	
	// ESTADO LIMPO OU SUJO
	private boolean clean;
	
	// QUANTIDADE DE ÁGUA
	private int water;
	
	// QUANTIDADE DE SHAMPOO
	private int shampoo;
	
	// PET QUE ESTÁ DENTRO DA MÁQUINA
	private Pet pet;

	
	// GETTERS AND SETTERS
	public boolean isClean() {
		return clean;
	}

	// COLOCAR NO CHUVEIRO
	public void takeAShower(Pet pet) {
		if (this.pet == null && this.water >= 10 && this.shampoo >= 2) {
			this.pet = pet;
			pet.setClean(true);
			System.out.println("O pet " + this.pet.getName() + " agora está limpo!");
			// GASTANDO 10 LITROS COM O BANHO
			this.water = this.water - 10;
			this.shampoo = this.shampoo - 2;
			
		} else if (this.pet != null) {
			System.out.println("Retire o " + this.pet.getName() + " para colocar o próximo pet.");
		} else if (this.water < 10) {
			System.out.println("Abasteça no mínimo 10 litros para dar banho no Pet.");
		} else {
			System.out.println("Abasteça no mínimo 2 litros de shampoo para dar banho no Pet.");
		}
	}
	
	// ABASTECER COM ÁGUA
	public void waterSupply() {
		// VERIFICAR O NÍVEL DO RESERVATÓRIO ANTES DE ABASTECER
		if (this.water == 30) System.out.println("O reservatório de água cheio!");
		else if(this.water + 2 > 30) System.out.println("\u001B[31mNão é possível abastecer com água no momento, porque excederá o limite do reservatório!\u001B[0m");
		else {
			 // COLOCAR 2 LITROS DE ÁGUA NO RESERVATÓRIO
			 this.water = this.water + 2;
			 System.out.println("\u001B[32mAbastecendo com mais 2 litros de água...\u001B[0m");
		 }
	}
	
	// ABASTECER COM SHAMPOO
	public void refillShampoo() {
		// VERIFICAR O NÍVEL DO SHAMPOO ANTES DE ABASTECER
		if (this.shampoo == 10) System.out.println("O reservatório de shampoo está cheio!");
		else if (this.shampoo + 2 > 10) System.out.println("\u001B[31mNão é possível abastecer com shampoo no momento, porque excederá o limite do reservatório!\u001B[0m");
		else {
			// COLOCAR 2 LITROS DE SHAMPOO NO RESERVATÓRIO
			this.shampoo = this.shampoo + 2;
			System.out.println("\u001B[32mAbastecendo com mais 2 litros de shampoo...\u001B[0m");
		}
	}
	
	// VERIFICAR NÍVEL DE ÁGUA
	public void checkWater() {
		switch(this.water) {
			case 30 -> System.out.println("O reservatório de água está completo!");
			case 0 -> System.out.println("O reservatório de água está vazio!");
			default -> System.out.println("\u001B[1mNível de água: \u001B[0m" + this.water + " Litros");
		}
	}
	
	// VERIFICAR NÍVEL DE SHAMPOO
	public void checkShampoo() {
		switch(this.shampoo) {
			case 10 -> System.out.println("O reservatório de shampoo está completo!");
			case 0 -> System.out.println("O reservatório de shampoo está vazio!");
			default -> System.out.println("\u001B[1mNível de shampoo: \u001B[0m" + this.water + " Litros");
		}
	}
	
	// VERIFICAR SE TEM PET NO BANHO
	public void inUse() {
		if (this.pet == null) System.out.println("A máquina de banho está vazia!");
	}
	
	
	
}
