package br.com.luhf.services;


import br.com.luhf.domain.Cliente;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.exceptions.TipoChaveNaoEncontradaException;
import br.com.luhf.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException;

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
