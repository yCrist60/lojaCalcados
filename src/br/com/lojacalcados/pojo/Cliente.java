package br.com.lojacalcados.pojo;

public class Cliente {
	private Long idCliente;
	private String nomeCliente;
	private DadosPessoais dadosPessoais;
	private Endereco endereco;
	private Contato contato;
	public Cliente() {
	}
	public Cliente(Long idCliente, String nomeCliente, DadosPessoais dadosPessoais, Endereco endereco,
			Contato contato) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dadosPessoais = dadosPessoais;
		this.endereco = endereco;
		this.contato = contato;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
}
