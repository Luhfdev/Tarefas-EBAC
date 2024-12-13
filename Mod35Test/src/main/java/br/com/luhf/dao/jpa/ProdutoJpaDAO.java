package br.com.luhf.dao.jpa;

import br.com.luhf.dao.generic.jpa.GenericJpaDAO;
import br.com.luhf.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
