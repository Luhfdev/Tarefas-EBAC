package br.com.luhf.services;

import br.com.luhf.dao.IProdutoDAO;
import br.com.luhf.domain.Produto;
import br.com.luhf.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
