package builder;

import java.math.BigDecimal;

public class MainBuilder {

	public static void main(String[] args) {
		Pedido pedido = new PedidoBuilder()
							.setPedido("1546")
							.setCliente(50, "Alex", "55963587")
							.setVendedor(5, "Michel")
							.setProduto("Carne", 1, new BigDecimal(30.60))
							.setProduto("Arroz", 2, new BigDecimal(10.00))
							.setProduto("Leite", 1, new BigDecimal(5.40)).builder();
		pedido.informacoes();
	}

}
