package aula.poo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void addProduto(Produto produto) {
//		poderia fazer varias valida��es antes de adicionar o produto na lista
		this.listaProdutos.add(produto);
	}
	
	private double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
//	esse m�todo j� chama o total de vendas que faz o calculo do valor total
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}

}
