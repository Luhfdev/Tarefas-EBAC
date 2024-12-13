package br.com.luhf.dao;

import java.util.List;

import br.com.luhf.dao.generic.IGenericDAO;
import br.com.luhf.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}