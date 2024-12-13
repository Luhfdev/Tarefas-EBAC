package br.com.luhf.test;

import br.com.luhf.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Lui");

        Assert.assertEquals("Lui", cli.getNome());
    }
}
