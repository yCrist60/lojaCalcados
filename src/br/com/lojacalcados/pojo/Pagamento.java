package br.com.lojacalcados.pojo;

public class Pagamento {
	private Long idPagamento;
	private Venda venda;
	private String formapagamento;
	private Double valor;
	private Integer parcela;
	private Double valorparcela;
	private String observacao;
	public Pagamento() {
	}
	public Pagamento(Long idPagamento, Venda venda, String formapagamento, Double valor, Integer parcela,
			Double valorparcela, String observacao) {
		this.idPagamento = idPagamento;
		this.venda = venda;
		this.formapagamento = formapagamento;
		this.valor = valor;
		this.parcela = parcela;
		this.valorparcela = valorparcela;
		this.observacao = observacao;
	}
	public Long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getParcela() {
		return parcela;
	}
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}
	public Double getValorparcela() {
		return valorparcela;
	}
	public void setValorparcela(Double valorparcela) {
		this.valorparcela = valorparcela;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
