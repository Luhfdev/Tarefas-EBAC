package br.com.luhf.service;

import br.com.luhf.dao.ClienteDao;
import br.com.luhf.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }


}
