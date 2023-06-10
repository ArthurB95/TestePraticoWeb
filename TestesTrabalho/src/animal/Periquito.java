package animal;

public class Periquito extends Ave {
	@Override
	public void emitirSomAve() {
		System.out.println("Som de Ave!");
	}
	
	public void abrirGaiola(boolean gaiolaAberta) {
		if(gaiolaAberta == true) {
			System.out.print("Periquito vai voar!");
		} else {
			System.out.print("Gaiola está fechada, periquito não pode voar!");
		}
	}
}
