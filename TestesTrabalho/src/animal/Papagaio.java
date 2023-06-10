package animal;

public class Papagaio extends Ave {
	@Override
	public void emitirSomAve() {
		System.out.println("Som de Ave!");
	}
	
	public void imitarDono(boolean dono) {
		if(dono == true) {
			System.out.print("Imitar o som do dono!");
		} else {
			System.out.print("Você não é o meu dono, não vou lhe imitar!");
		}
	}
}
