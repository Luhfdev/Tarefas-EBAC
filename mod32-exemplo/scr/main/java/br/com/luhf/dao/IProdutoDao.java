package main.java.br.com.luhf.dao;

import main.java.br.com.luhf.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto pro);

    public List<Produto> buscarTodos();
}
