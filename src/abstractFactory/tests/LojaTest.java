package abstractFactory.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import abstractFactory.Loja;
import abstractFactory.boleto.BoletoBancoInter;

public class LojaTest {
	
	@Test
	public void CheckedIfReturnCriarNFETest() {
		Loja loja = new Loja();
		BoletoBancoInter bbinter = new BoletoBancoInter();
		assertEquals(bbinter, loja.criarBoleto());
	}
}
