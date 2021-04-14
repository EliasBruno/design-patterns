package abstractFactory;

import java.math.BigDecimal;

import abstractFactory.venda.Venda;
import abstractFactory.venda.VendaFactory;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("TV Sansumg");
		produto.setQuantidade(1);
		produto.setValor(new BigDecimal(1000.00));
		
		VendaFactory factory = new Loja();
		
		Venda venda = new Venda(factory);
		venda.realizarVenda(produto);

	}

}
