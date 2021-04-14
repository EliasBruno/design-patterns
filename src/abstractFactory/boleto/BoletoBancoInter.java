package abstractFactory.boleto;

import abstractFactory.Produto;

public class BoletoBancoInter implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("Banco Inter /n");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: " + produto.getValor());
	}

}
