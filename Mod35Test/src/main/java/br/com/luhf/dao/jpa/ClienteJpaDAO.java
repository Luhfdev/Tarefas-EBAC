package br.com.luhf.dao.jpa;

import br.com.luhf.dao.generic.jpa.GenericJpaDAO;
import br.com.luhf.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
