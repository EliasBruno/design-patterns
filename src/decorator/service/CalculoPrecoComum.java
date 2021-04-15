package decorator.service;

import java.math.BigDecimal;

import decorator.model.Produto;

public class CalculoPrecoComum implements CalculoPreco {

	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal imposto = new BigDecimal("20.50");
		BigDecimal valorFinal = produto.getValor().add(produto.getValor().multiply(imposto));
		
		return valorFinal;
	}
	
}
