package br.com.lojacalcados.pojo;

public class DetalheVenda {
	private Long idDetalheVenda;
	private Venda venda;
	private Produto produto;
	private Integer quantidade;
	private String observacao;
	private Double subtotal;
	public DetalheVenda() {
	}
	public DetalheVenda(Long idDetalheVenda, Venda venda, Produto produto, Integer quantidade, String observacao,
			Double subtotal) {
		this.idDetalheVenda = idDetalheVenda;
		this.venda = venda;
		this.produto = produto;
		this.quantidade = quantidade;
		this.observacao = observacao;
		this.subtotal = subtotal;
	}
	public Long getIdDetalheVenda() {
		return idDetalheVenda;
	}
	public void setIdDetalheVenda(Long idDetalheVenda) {
		this.idDetalheVenda = idDetalheVenda;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
}
