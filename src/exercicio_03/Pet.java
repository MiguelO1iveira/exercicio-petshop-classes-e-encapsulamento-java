package exercicio_03;

public class Pet {
	
	private final String name;
	
	private boolean clean;
	
	// CONSTRUTOR
	public Pet(String name) {
		this.name = name;
		this.clean = false;
	}
	
	// RETORNAR O NOME DO PET
	public String getName() {
		return name;
	}
	
	
	
	public boolean isClean() {
	
		return clean;
	}
	
	// ALTERAR PARA LIMPO OU SUJO
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
	
}
