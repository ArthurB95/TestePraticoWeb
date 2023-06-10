package animal;

public class Lobo extends Mamifero {
	@Override
	public void emitirSomMamifero() {
		System.out.println("Auuuuuuuuuuuuu!");
	}
	
	public void reagirHumorHoraLobo(int hora) {
		if(hora >= 6 && hora <= 12) {
			System.out.println("Rosnar!! GGGRRRRRRR!");
		} else if(hora > 12 && hora < 18) {
			System.out.println("Ignorar e latir!");
		} else {
			System.out.println("Uivar! AAAUUUUHHHHHHH!!!");
		}
	}
	
	public void reagirHumorViuPessoaLobo(boolean viuPessoa) {
		if(viuPessoa == true) {
			System.out.println("Atacar pessoa!");
		} else {
			System.out.println("Voltar para o que estava fazendo!");
		}
	}
}
