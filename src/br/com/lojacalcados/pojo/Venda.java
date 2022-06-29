package br.com.lojacalcados.pojo;

import java.util.Date;

public class Venda {
	private Long idVenda;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataHora;
	public Venda() {
	}
	public Venda(Long idVenda, Cliente cliente, Funcionario funcionario, Date dataHora) {
		this.idVenda = idVenda;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataHora = dataHora;
	}
	public Long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	
}
