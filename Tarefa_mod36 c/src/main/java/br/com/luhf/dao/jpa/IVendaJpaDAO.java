package main.java.br.com.luhf.dao.jpa;

import main.java.br.com.luhf.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.luhf.domain.jpa.VendaJpa;
import main.java.br.com.luhf.exceptions.DAOException;
import main.java.br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * @see VendaJpa produtos
     *
     * @param id
     * @return
     */
    public VendaJpa consultarComCollection(Long id);
}