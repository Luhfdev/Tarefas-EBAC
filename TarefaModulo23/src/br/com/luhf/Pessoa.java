package br.com.luhf;

import java.util.List;

public class Pessoa {

    private String nome;

    private String genero;

    public Pessoa() {

    }

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public List<Pessoa> pessoas(){
        Pessoa pessoa1 = new Pessoa("João", "Homem");
        Pessoa pessoa2 = new Pessoa("Maria", "Mulher");
        Pessoa pessoa3 = new Pessoa("Cleusa", "Mulher");
        Pessoa pessoa4 = new Pessoa("Matheus", "Homem");
        Pessoa pessoa5 = new Pessoa("Osvaldo", "Homem");
        Pessoa pessoa6 = new Pessoa("Fernanda", "Mulher");

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
    }
}
