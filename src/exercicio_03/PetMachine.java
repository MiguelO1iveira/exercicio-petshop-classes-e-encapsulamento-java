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
	public void putInTheShower(Pet pet) {
		if (this.pet == null && this.clean) {
			this.pet = pet;
			System.out.println("O pet " + this.pet.getName() + " foi colocado(a) na máquina de banho!");
		} else if(!this.clean) {		
			System.out.println("Limpe a máquina antes de colocar o próximo pet!");
		} else System.out.println("Retire o " + this.pet.getName() + " para colocar o próximo pet.");
	}
	
	// TIRAR DO CHUVEIRO
	public void removeFromTheShower(Pet pet) {
		if (this.pet != null) {
			System.out.println("O pet " + this.pet.getName() + " foi removido da máquina de banho!");
			// CONFERIR SE O PET TOMOU O BANHO
			if (!this.pet.isClean()) {
				System.out.println("O pet foi removido sem dar banho, por isso agora a máquina está suja!");
				this.clean = false;
			}
			
			this.pet = null;
		} else System.out.println("A máquina de banho está vazia!");
	}
	
	// DAR BANHO
	public void bathe() {
		if (this.pet != null && this.water >= 10 && this.shampoo >= 2) {
			this.pet.setClean(true);
			this.water -= 10;
			this.shampoo -= 2;
			System.out.println("\u001B[32mBanho finalizado, agora " + this.pet.getName() + " está limpo!\u001B[0m");
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
			 System.out.println("Abastecendo com mais 2 litros de água...");
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
			System.out.println("Abastecendo com mais 2 litros de shampoo...");
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
			default -> System.out.println("\u001B[1mNível de shampoo: \u001B[0m" + this.shampoo + " Litros");
		}
	}
	
	// VERIFICAR SE TEM PET NO BANHO
	public void inUse() {
		if (this.pet == null) System.out.println("A máquina de banho está vazia!");
		else System.out.println("Máquina ocupada pelo(a) " + pet.getName());
	}
	
	
	
}
