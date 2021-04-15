package decorator.service;

import java.math.BigDecimal;

import decorator.model.Produto;

public class CalculoPrecoComFrete implements CalculoPreco{
	private CalculoPreco calculoPreco;
		
	public CalculoPrecoComFrete(CalculoPreco calculoPreco) {
		this.calculoPreco = calculoPreco;
	}

	@Override
	public BigDecimal valorFinal(Produto produto) {
		
		BigDecimal valorFinal = calculoPreco.valorFinal(produto);
		
		BigDecimal frete;
		
		if(produto.getQuantidade() > 40) {
			frete = new BigDecimal("2.65");
			valorFinal = valorFinal.add(frete);
			
		}else {
			frete = new BigDecimal("1.60");
			valorFinal = valorFinal.add(frete);
		}
		
		return valorFinal;
	}

}
