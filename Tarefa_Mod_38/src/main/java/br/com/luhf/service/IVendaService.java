package br.com.luhf.service;

import br.com.luhf.dao.generic.IGenericDAO;
import br.com.luhf.domain.Venda;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	/**
	 * @see VendaJpa produtos
	 * 
	 * @param id
	 * @return
	 */
	public Venda consultarComCollection(Long id);

}