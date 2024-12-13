package main.java.br.com.luhf.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "TB_CADASTRO")
public class Venda {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="cadastro_seq")
    @SequenceGenerator(name="cadastro_seq", sequenceName="sq_cadastro", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private Instant dataCadastro;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Instant getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Instant dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
