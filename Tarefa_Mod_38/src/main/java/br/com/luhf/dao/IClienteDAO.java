package br.com.luhf.dao;

import java.util.List;

import br.com.luhf.dao.generic.IGenericDAO;
import br.com.luhf.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}