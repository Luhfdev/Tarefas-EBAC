package main.java.br.com.luhf.dao.jpa;

import main.java.br.com.luhf.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.luhf.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}