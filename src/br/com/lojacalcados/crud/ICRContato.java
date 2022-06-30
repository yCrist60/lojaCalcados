package br.com.lojacalcados.crud;

import br.com.lojacalcados.pojo.Contato;

public interface ICRContato extends ICR<Contato>{
	
	public String atualizarTelefone(Contato contato);

}
