package decorator.service;

import java.math.BigDecimal;

import decorator.model.Produto;

public interface CalculoPreco {
	
	public BigDecimal valorFinal(Produto produto);

}
