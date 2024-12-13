package main.java.br.com.luhf.dao.jpa;

import main.java.br.com.luhf.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.luhf.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
