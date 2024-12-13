package main.java.br.com.luhf.dao;

import main.java.br.com.luhf.domain.Produto;
import main.java.br.com.luhf.domain.Venda;

import java.util.List;

public interface IVendaDao {

    Venda cadastrar(Venda sell);

    Venda buscarPorCodigoProduto(String codigoProduto);

    Venda buscarPorProduto(Produto produto);

    Venda buscarPorCodigoProdutoCriteria(String codigoProduto);

    Venda buscarPorProdutoCriteria(Produto produto);

    List<Venda> buscarTodos();

    void excluir(Venda venda);
}
