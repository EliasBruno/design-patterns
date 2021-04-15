package decorator.service;

import java.math.BigDecimal;

import decorator.model.Produto;

public class CalculoPrecoComBrinde implements CalculoPreco{
	
	private CalculoPreco calculoPreco;
		
	public CalculoPrecoComBrinde(CalculoPreco calculoPreco) {
		this.calculoPreco = calculoPreco;
	}

	@Override
	public BigDecimal valorFinal(Produto produto) {
		
		BigDecimal valorFinal = calculoPreco.valorFinal(produto);
		
		BigDecimal valorBrinde = new BigDecimal("200.00");
		
		valorFinal = valorFinal.add(valorBrinde);
		
		return valorFinal;
	}
	
}
