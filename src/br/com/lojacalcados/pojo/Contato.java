package br.com.lojacalcados.pojo;

public class Contato {
	private Long idContato;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String telefoneComercial;
	private String email;
	
	public Contato() {}

	public Contato(Long idContato, String telefoneResidencial, String telefoneCelular, String telefoneComercial,
			String email) {
		this.idContato = idContato;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
		this.telefoneComercial = telefoneComercial;
		this.email = email;
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
