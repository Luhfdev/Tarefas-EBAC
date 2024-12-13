package br.com.luhf.service;

public interface IContratoService {
    String salvar();

    String buscar(String nome);


    String excluir();

    String atualizar();
}
