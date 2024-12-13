package main.java.br.com.luhf.dao.jpa;

import main.java.br.com.luhf.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.luhf.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}