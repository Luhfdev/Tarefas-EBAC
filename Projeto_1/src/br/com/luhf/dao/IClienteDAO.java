package br.com.luhf.dao;

import br.com.luhf.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    Boolean cadastrar(Cliente cliente);

    Cliente excluir (Long cpf);

    void alterar (Cliente cliente);

    Cliente consultar(Long cpf);

    Collection<Cliente> buscarTodos();
}
