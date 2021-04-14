package abstractFactory.boleto;

import abstractFactory.Produto;

public interface Boleto {
	
	public void emitir(Produto produto, double imposto);
	
}
