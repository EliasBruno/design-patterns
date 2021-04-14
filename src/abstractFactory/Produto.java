package abstractFactory;

import java.math.BigDecimal;

public class Produto {
	private String nome;
	private BigDecimal valor;
	private Integer quantidade;
	
	public double getValorTotal(double imposto) {
		BigDecimal valorTotal = valor.add(new BigDecimal(imposto));
		
		valorTotal = valorTotal.multiply(new BigDecimal(quantidade));
		
		return valorTotal.doubleValue();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
