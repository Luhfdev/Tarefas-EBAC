package java.br.com.luhf;

import main.java.br.com.luhf.dao.IClienteDAO;
import main.java.br.com.luhf.domain.Cliente;
import main.java.br.com.luhf.exceptions.DAOException;
import main.java.br.com.luhf.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.luhf.services.ClienteService;
import main.java.br.com.luhf.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.br.com.luhf.dao.ClienteDAOMock;


public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}
