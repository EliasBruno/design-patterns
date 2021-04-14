package abstractFactory.nfe;

import java.math.BigDecimal;

import abstractFactory.Produto;

public class NFEMaranhao implements NFE{

	@Override
	public double caucularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.20");
		
		imposto = imposto.multiply(new BigDecimal(produto.getQuantidade()));
		
		return imposto.doubleValue();
	}

}
