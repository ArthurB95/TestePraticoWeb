package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteUnit {
	
	@Test
	public void testCachorroReagirComida() {
        Cachorro c = new Cachorro();

        System.out.println(" TESTE CACHORRO REAGIR COMIDA!! ");
        c.reagirComida("Olá");
        c.reagirComida("Vou embora!!");        
	}
	
	@Test
	public void testCachorroReagirHumorHora() {
        Cachorro c = new Cachorro();

        System.out.println("TESTE CACHORRO REAGIR HUMOR HORA!!");
        c.reagirHumorHora(12, 54);
        c.reagirHumorHora(11, 54);
        c.reagirHumorHora(19, 54);
	}
	
	@Test
	public void testCachorroReagirHumorPeso() {
        Cachorro c = new Cachorro();

        System.out.println("TESTE CACHORRO REAGIR HUMOR PESO!!");
        c.reagirHumorPeso(12, 54);
        c.reagirHumorPeso(4, 9);
	}
	
	@Test
	public void testLoboReagirHumorHoraLobo() {
        Lobo l = new Lobo();

        System.out.println("TESTE LOBO REAGIR HUMOR HORA LOBO!!");
        l.reagirHumorHoraLobo(12);
        l.reagirHumorHoraLobo(13);
        l.reagirHumorHoraLobo(19);
	}
	
	@Test
	public void testLoboReagirHumorViuPessoaLobo() {
        Lobo l = new Lobo();

        System.out.println("TESTE LOBO REAGIR HUMOR VIU PESSOA LOBO!!");
        l.reagirHumorViuPessoaLobo(true);
        l.reagirHumorViuPessoaLobo(false);
	}
	
	@Test
	public void testCobraTrocarEscamas() {
        Cobra co = new Cobra();

        System.out.println("TESTE COBRA TROCAR ESCAMAS!!");
        co.trocarEscamas(1);
        co.trocarEscamas(3);
        co.trocarEscamas(6);
	}
	
	@Test
	public void testCobraAtacarPresa() {
        Cobra co = new Cobra();

        System.out.println("TESTE COBRA ATACAR PRESA!!");
        co.atacarPresa("Humano");
        co.atacarPresa("Mamifero");
        co.atacarPresa("Reptil");
	}
	
	@Test
	public void testAveVoarParaLonge() {
        Ave a = new Ave();

        System.out.println("TESTE AVE VOAR PARA LONGE!!");
        a.voarParaLonge(true);
        a.voarParaLonge(false);
	}
	
	@Test
	public void testAveAvistarPresa() {
        Ave a = new Ave();

        System.out.println("TESTE AVE AVISTAR PRESA!!");
        a.avistarPresa(true);
        a.avistarPresa(false);
	}
	
	@Test
	public void testBancoZooContaCorrente() {
        BancoZoo bz = new BancoZoo();

        System.out.println("TESTE BANCO ZOO CONTA CORRENTE!!");
        bz.setNumConta(1111);
        bz.setDono("Arthur");
        bz.abrirConta("CC");
        bz.depositar(100);
        bz.sacar(150);
        bz.fecharConta();
        bz.estadoAtual();
	}
	
	@Test
	public void testBancoZooContaPoupanca() {
        BancoZoo bz = new BancoZoo();

        System.out.println("TESTE BANCO ZOO CONTA POUPANCA!!");
        bz.setNumConta(2222);
        bz.setDono("Jordana");
        bz.abrirConta("CP");
        bz.depositar(500);
        bz.sacar(100);
        bz.estadoAtual();
	}

}
