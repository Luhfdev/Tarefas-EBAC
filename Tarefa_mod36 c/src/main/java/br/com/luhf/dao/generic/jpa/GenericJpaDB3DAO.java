package main.java.br.com.luhf.dao.generic.jpa;

import java.io.Serializable;

import main.java.br.com.luhf.domain.jpa.Persistente;

public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}
