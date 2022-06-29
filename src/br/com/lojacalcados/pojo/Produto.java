package br.com.lojacalcados.pojo;

public class Produto {
	private Long idProduto;
	private String nomeproduto;
	private String descricao;
	private String categoria;
	private String marca;
	private String cor;
	private String tamanho;
	private String peso;
	private String genero;
	private Double preco;
	public Produto() {
	}
	public Produto(Long idProduto, String nomeproduto, String descricao, String categoria, String marca, String cor,
			String tamanho, String peso, String genero, Double preco) {
		this.idProduto = idProduto;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.peso = peso;
		this.genero = genero;
		this.preco = preco;
	}
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
