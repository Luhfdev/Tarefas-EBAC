package br.com.luhf.dao;

import br.com.luhf.dao.generic.IGenericDAO;
import br.com.luhf.domain.Venda;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
