package br.com.luhf.service;

import java.util.List;

import br.com.luhf.domain.Produto;
import br.com.luhf.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}