package br.com.luhf.test;

import br.com.luhf.dao.ClienteDao;
import br.com.luhf.dao.mock.ClienteDaoMock;
import br.com.luhf.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock clienteDaoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDaoMock);
        String retornoSucesso = service.salvar();
        Assert.assertEquals("Sucesso", retornoSucesso);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        ClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retornoSucesso = service.salvar();
        Assert.assertEquals("Sucesso", retornoSucesso);
    }
}
