package br.com.lojacalcados.crud;

import br.com.lojacalcados.pojo.Usuario;

public interface ICRUsuario extends ICR<Usuario> {
	public String alterarSenha(Usuario user);
	public String login(Usuario user);
}
