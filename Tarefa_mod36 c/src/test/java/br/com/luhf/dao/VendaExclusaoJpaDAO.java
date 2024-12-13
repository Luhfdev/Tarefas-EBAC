package java.br.com.luhf.dao;

import main.java.br.com.luhf.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.luhf.dao.jpa.IVendaJpaDAO;
import main.java.br.com.luhf.domain.jpa.VendaJpa;
import main.java.br.com.luhf.exceptions.DAOException;
import main.java.br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }
}
