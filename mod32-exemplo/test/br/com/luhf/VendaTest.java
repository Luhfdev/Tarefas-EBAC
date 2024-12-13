package br.com.luhf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.time.Instant;
import java.util.List;
import main.java.br.com.luhf.dao.IProdutoDao;
import main.java.br.com.luhf.dao.IVendaDao;
import main.java.br.com.luhf.dao.ProdutoDao;
import main.java.br.com.luhf.dao.VendaDao;
import main.java.br.com.luhf.domain.Produto;
import main.java.br.com.luhf.domain.Venda;
import org.junit.After;
import org.junit.Test;

public class VendaTest {

    private IVendaDao vendaDao;

    private IProdutoDao produtoDao;

    public VendaTest() {
        vendaDao = new VendaDao();
        produtoDao = new ProdutoDao();
    }

    @After
    public void end() {
        List<Venda> list = vendaDao.buscarTodos();
        list.forEach(sell -> vendaDao.excluir(sell));

        List<Produto> listCursos = produtoDao.buscarTodos();
        listCursos.forEach(cur -> produtoDao.excluir(cur));
    }

    @Test
    public void cadastrar() {
        Produto curso = criarProduto("A1");
        Venda sell = new Venda();
        sell.setCodigo("A1");
        sell.setDataCadastro(Instant.now());
        sell.setValor(2000d);
        sell = vendaDao.cadastrar(sell);

        assertNotNull(sell);
        assertNotNull(sell.getId());
    }

    @Test
    public void pesquisarPorCodigoProduto() {
        Produto produto = criarProduto("A1");
        Venda sell = new Venda();
        sell.setCodigo("A1");
        sell.setDataCadastro(Instant.now());
        sell.setValor(2000d);
        sell = vendaDao.cadastrar(sell);

        assertNotNull(sell);
        assertNotNull(sell.getId());

        Venda vendaBD = vendaDao.buscarPorCodigoProduto(produto.getCodigo());
        assertNotNull(vendaBD);
        assertEquals(sell.getId(), vendaBD.getId());
    }

    @Test
    public void pesquisarPorCodigoCursoCriteria() {
        Produto produto = criarProduto("A1");
        Venda sell = new Venda();
        sell.setCodigo("A1");
        sell.setDataCadastro(Instant.now());
        sell.setValor(2000d);
        sell = vendaDao.cadastrar(sell);

        assertNotNull(sell);
        assertNotNull(sell.getId());

        Venda vendaBD = vendaDao.buscarPorCodigoProdutoCriteria(produto.getCodigo());
        assertNotNull(vendaBD);
        assertEquals(sell.getId(), vendaBD.getId());
    }

    @Test
    public void pesquisarPorCursoCriteria() {
        Produto produto = criarProduto("A1");
        Venda sell = new Venda();
        sell.setCodigo("A1");
        sell.setDataCadastro(Instant.now());
        sell.setValor(2000d);
        sell = vendaDao.cadastrar(sell);

        assertNotNull(sell);
        assertNotNull(sell.getId());

        Venda vendaBD = vendaDao.buscarPorProdutoCriteria(produto);
        assertNotNull(vendaBD);
        assertEquals(sell.getId(), vendaBD.getId());
    }


    private Produto criarProduto(String codigo) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setValor(4.99);
        produto.setName("Curso de Java Backend");
        return produtoDao.cadastrar(produto);
    }
}
