package br.com.luhf;

import main.java.br.com.luhf.dao.IProdutoDao;
import main.java.br.com.luhf.dao.ProdutoDao;
import main.java.br.com.luhf.domain.Produto;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao daoProduto;

    public ProdutoTest() {
        daoProduto = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setName("Arroz");
        produto.setValor(4.99);
        produto.setQuantidade(50);
        produto = daoProduto.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
