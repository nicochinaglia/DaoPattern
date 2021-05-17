package br.com.fatecararas.dao.impl;

import br.com.fatecararas.dao.ContatoDAO;
import br.com.fatecararas.model.Contato;

import java.util.List;

public class ContatoDAOImpl implements ContatoDAO {
    @Override
    public void salvar(Contato contato) {

    }

    @Override
    public Contato atualizar(Contato contato) {
        return null;
    }

    @Override
    public Contato buscarNome(String nome) {
        return null;
    }

    @Override
    public boolean apagar(Contato contato) {
        return false;
    }

    @Override
    public List<Contato> buscarTodosContatos() {
        return null;
    }
}
