package decorator;

import java.math.BigDecimal;

import decorator.model.Produto;
import decorator.service.CalculoPreco;
import decorator.service.CalculoPrecoComFrete;
import decorator.service.CalculoPrecoComum;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Tomate");
		produto.setQuantidade(50);
		produto.setValor(new BigDecimal("400.00"));
		
		CalculoPreco calculo = new CalculoPrecoComFrete(new CalculoPrecoComum());
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("R$" + preco.doubleValue());
	}

}
