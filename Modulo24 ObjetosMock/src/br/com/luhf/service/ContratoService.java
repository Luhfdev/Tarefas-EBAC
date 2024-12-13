package br.com.luhf.service;

import br.com.luhf.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Salvo com sucesso!";
    }

    @Override
    public String buscar(String nome) {
        contratoDao.buscar();
        return nome;
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado com sucesso!";
    }
}
