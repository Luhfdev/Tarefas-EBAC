package main.java.br.com.luhf.services;

import main.java.br.com.luhf.dao.IClienteDAO;
import main.java.br.com.luhf.domain.Cliente;
import main.java.br.com.luhf.exceptions.DAOException;
import main.java.br.com.luhf.exceptions.MaisDeUmRegistroException;
import main.java.br.com.luhf.exceptions.TableException;
import main.java.br.com.luhf.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.luhf.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		return clienteDAO.cadastrar(cliente);
	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

	@Override
	public void excluir(Long cpf) throws DAOException {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		clienteDAO.alterar(cliente);
	}

}
