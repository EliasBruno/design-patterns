package abstractFactory.venda;

import abstractFactory.Produto;
import abstractFactory.boleto.Boleto;
import abstractFactory.nfe.NFE;

public class Venda {
	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		
		this.notaFiscal = factory.criarNFE();
	
		this.boleto = factory.criarBoleto();
	
	}
	
	public void realizarVenda(Produto produto) {
		
		double imposto = notaFiscal.caucularImposto(produto);
		
		boleto.emitir(produto, imposto);
	
	}
}
