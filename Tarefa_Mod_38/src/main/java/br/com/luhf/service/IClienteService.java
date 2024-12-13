package br.com.luhf.service;

import java.util.List;

import br.com.luhf.domain.Cliente;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);
}