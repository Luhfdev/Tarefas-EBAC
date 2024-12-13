package br.com.luhf.dao.jpa;

import br.com.luhf.dao.generic.jpa.IGenericJpaDAO;
import br.com.luhf.domain.jpa.VendaJpa;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Usando este método para evitar a exception org.hibernate.LazyInitializationException
     * Ele busca todos os dados de objetos que tenham colletion pois a mesma por default é lazy
     * Mas você pode configurar a propriedade da collection como fetch = FetchType.EAGER na anotação @OneToMany e usar o consultar genérico normal
     *
     * @see VendaJpa produtos
     *
     * @param id
     * @return
     */
    public VendaJpa consultarComCollection(Long id);
}
