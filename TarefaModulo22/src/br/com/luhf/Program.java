package br.com.luhf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Adicione pessoas (digite 'sair' para encerrar):");
        String entrada;
        while (!(entrada = sc.nextLine()).equalsIgnoreCase("sair")) {
            int posicaoVirgula = entrada.indexOf(",");
            if (posicaoVirgula == -1) {
                System.out.println("Formato inválido. Use 'nome, genero'.");
                continue;
            }
            String nome = entrada.substring(0, posicaoVirgula);
            String genero = entrada.substring(posicaoVirgula + 2);
            pessoas.add(new Pessoa(nome, genero));}

        //List<Pessoa> mulheres = new ArrayList<>();

        List<Pessoa> listaMulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Mulher"))
                .toList();
        System.out.println(listaMulheres);








    }
}
