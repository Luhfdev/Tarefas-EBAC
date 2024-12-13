package br.com.luhf.dao.generic.jpa;

import br.com.luhf.dao.Persistente;
import br.com.luhf.exceptions.DAOException;
import br.com.luhf.exceptions.MaisDeUmRegistroException;
import br.com.luhf.exceptions.TableException;
import br.com.luhf.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;
}
