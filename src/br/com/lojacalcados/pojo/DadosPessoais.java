package br.com.lojacalcados.pojo;

import java.util.Date;

public class DadosPessoais {
	private Long idDadosPessoais;
	private String cpf;
	private Date dataNascimento;
	private String sexo;
	
	public DadosPessoais() {}

	public DadosPessoais(Long idDadosPessoais, String cpf, Date dataNascimento, String sexo) {
		this.idDadosPessoais = idDadosPessoais;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public Long getIdDadosPessoais() {
		return idDadosPessoais;
	}

	public void setIdDadosPessoais(Long idDadosPessoais) {
		this.idDadosPessoais = idDadosPessoais;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
