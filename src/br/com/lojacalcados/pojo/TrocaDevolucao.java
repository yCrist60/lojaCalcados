package br.com.lojacalcados.pojo;

import java.util.Date;

public class TrocaDevolucao {

	private Long idTrocaDevolucao;
	private Venda venda;
	private Produto produto;
	private String motivo;
	private Date datahoratrocadevolucao;
	
	
	public TrocaDevolucao() {
	}
	public TrocaDevolucao(Long idTrocaDevolucao, Venda venda, Produto produto, String motivo,
			Date datahoratrocadevolucao) {
		this.idTrocaDevolucao = idTrocaDevolucao;
		this.venda = venda;
		this.produto = produto;
		this.motivo = motivo;
		this.datahoratrocadevolucao = datahoratrocadevolucao;
	}
	public Long getIdTrocaDevolucao() {
		return idTrocaDevolucao;
	}
	public void setIdTrocaDevolucao(Long idTrocaDevolucao) {
		this.idTrocaDevolucao = idTrocaDevolucao;
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
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getDatahoratrocadevolucao() {
		return datahoratrocadevolucao;
	}
	public void setDatahoratrocadevolucao(Date datahoratrocadevolucao) {
		this.datahoratrocadevolucao = datahoratrocadevolucao;
	}
	
	
	
	
}
