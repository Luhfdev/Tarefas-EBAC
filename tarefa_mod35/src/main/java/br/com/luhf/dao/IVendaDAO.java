package main.java.br.com.luhf.dao;

import main.java.br.com.luhf.exceptions.DAOException;
import main.java.br.com.luhf.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.luhf.dao.generic.IGenericDAO;
import main.java.br.com.luhf.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
