package br.com.lojacalcados.pojo;

import java.util.Date;

public class Estoque {
	private Long idEstoque;
	private String lote;
	private Produto produto;
	private Integer quantidade;
	private Date dataEntrada;
	private String origem;
	public Estoque() {
	}
	public Estoque(Long idEstoque, String lote, Produto produto, Integer quantidade, Date dataEntrada, String origem) {
		this.idEstoque = idEstoque;
		this.lote = lote;
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataEntrada = dataEntrada;
		this.origem = origem;
	}
	public Long getIdEstoque() {
		return idEstoque;
	}
	public void setIdEstoque(Long idEstoque) {
		this.idEstoque = idEstoque;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
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
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	
}
