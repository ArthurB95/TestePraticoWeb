package animal;

public class Ave extends AnimalAve {
	@Override
	public void emitirSomAve() {
		System.out.println("Som de Reptil!");
	}
	
	public void voarParaLonge(boolean viuPredador) {
		
		if(viuPredador == true) {
			System.out.println("Bater asas e voar!");
		} else {
			System.out.println("Permanecer no local!");
		}
	}
	
	public void avistarPresa(boolean viuPresa) {
		if(viuPresa == true) {
			System.out.println("Voar para pegar a presa!");
		} else {
			System.out.println("Permanecer no local!");
		}
	}
}
