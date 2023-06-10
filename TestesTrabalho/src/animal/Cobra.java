package animal;

public class Cobra extends AnimalReptil {
	@Override
	public void emitirSomReptil() {
		System.out.println("Ssssss! Sssss! Ssssss!");
	}
	
	public void trocarEscamas(int idade) {
		if(idade >= 1 && idade <=2) {
			System.out.println("A cobra vai trocar de escamas 2 vezes no ano!");
		} else if(idade >= 3 && idade <= 4) {
			System.out.println("A cobra vai trocar de escamas 3 vezes no ano!");
		} else {
			System.out.println("A cobra vai trocar de escamas 4 vezes no ano!");
		}
	}
	
	public void atacarPresa(String presa) {
		if(presa == "Humano") {
			System.out.println("Atacar humano! Ssssss! Ssssss!");
		} else if(presa == "Mamifero"){
				System.out.println("Atacar mamífero! Ssssss! Ssssss!");
		} else {
			System.out.println("Fugir para longe!");
		}
	}
	
}
