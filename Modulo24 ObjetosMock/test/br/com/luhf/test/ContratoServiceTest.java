package br.com.luhf.test;

import br.com.luhf.dao.ContratoDao;
import br.com.luhf.dao.IContratoDao;
import br.com.luhf.dao.mock.ContratoDaoMock;
import br.com.luhf.service.ContratoService;
import br.com.luhf.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Salvo com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Salvo com sucesso!", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("Jose");
        Assert.assertEquals("Jose", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("Jose");
        Assert.assertEquals("Jose", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals(retorno, "Excluido com sucesso!");

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals(retorno, "Excluido com sucesso!");

    }

    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals(retorno, "Atualizado com sucesso!");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals(retorno, "Atualizado com sucesso!");
    }
}
