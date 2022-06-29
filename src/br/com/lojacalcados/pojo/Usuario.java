package br.com.lojacalcados.pojo;

import java.util.Date;

public class Usuario {
	private Long idUsuario;
	private String nomeUsuario;
	private String senha;
	private String nivelAcesso;
	private Date criadoEm;
	
	public Usuario() {	}
	
	public Usuario(Long idUsuario, String nomeUsuario, String senha, String nivelAcesso, Date criadoEm) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
		this.criadoEm = criadoEm;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	
	
}
