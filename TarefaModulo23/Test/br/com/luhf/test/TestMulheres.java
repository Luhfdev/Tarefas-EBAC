package br.com.luhf.test;

import br.com.luhf.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class TestMulheres {

    List<Pessoa> pessoas2 = new Pessoa().pessoas();

    List<Pessoa> mulheres = pessoas2.stream()
            .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("mulher"))
            .collect(Collectors.toList());

    @Test
    public void Test() {
        mulheres.forEach(mulher -> Assert.assertTrue(mulher.getGenero().equalsIgnoreCase("mulher")));
    }
}
