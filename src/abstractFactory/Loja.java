package abstractFactory;

import abstractFactory.boleto.Boleto;
import abstractFactory.boleto.BoletoBancoInter;
import abstractFactory.nfe.NFE;
import abstractFactory.nfe.NFEMaranhao;
import abstractFactory.venda.VendaFactory;

public class Loja implements VendaFactory{

	@Override
	public NFE criarNFE() {
		NFE nfe = new NFEMaranhao();
		return nfe;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto= new BoletoBancoInter();
		
		return boleto;
	}
	
}
