package abstractFactory.venda;

import abstractFactory.boleto.Boleto;
import abstractFactory.nfe.NFE;

public interface VendaFactory {
	
	public NFE criarNFE();
	
	public Boleto criarBoleto();
	
}
