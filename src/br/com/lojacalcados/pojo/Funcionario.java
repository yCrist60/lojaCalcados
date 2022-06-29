package br.com.lojacalcados.pojo;

import java.util.Date;

public class Funcionario {
	private Long idFuncionario;
	private String nomeFuncionario;
	private String cargo;
	private String setor;
	private String gestor;
	private Date expediente;
	private DadosPessoais dadosPessoais;
	private Endereco endereco;
	private Contato contato;
	private Usuario usuario;
	
	
	public Funcionario() {
	}


	public Funcionario(Long idFuncionario, String nomeFuncionario, String cargo, String setor, String gestor,
			Date expediente, DadosPessoais dadosPessoais, Endereco endereco, Contato contato, Usuario usuario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.setor = setor;
		this.gestor = gestor;
		this.expediente = expediente;
		this.dadosPessoais = dadosPessoais;
		this.endereco = endereco;
		this.contato = contato;
		this.usuario = usuario;
	}


	public Long getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getGestor() {
		return gestor;
	}


	public void setGestor(String gestor) {
		this.gestor = gestor;
	}


	public Date getExpediente() {
		return expediente;
	}


	public void setExpediente(Date expediente) {
		this.expediente = expediente;
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


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
