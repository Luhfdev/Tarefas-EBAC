package main.java.br.com.luhf.services;

import main.java.br.com.luhf.dao.IProdutoDAO;
import main.java.br.com.luhf.domain.Produto;
import main.java.br.com.luhf.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
