package animal;

public class Mamifero  extends AnimalMamifero {
	protected String corPelo;

	@Override
	public void emitirSomMamifero() {
		System.out.println("Som de Mamífero!");
	}
}
