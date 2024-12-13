package main.java.br.com.luhf.dao;

import main.java.br.com.luhf.domain.Produto;
import main.java.br.com.luhf.domain.Venda;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import java.util.List;

public class VendaDao implements IVendaDao {


    @Override
    public Venda cadastrar(Venda sell) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(sell);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return sell;
    }

    @Override
    public Venda buscarPorCodigoProduto(String codigoProduto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT v FROM Venda v ");
        sb.append("INNER JOIN Produto p on p = v.produto ");
        sb.append("WHERE p.codigo = :codigoProduto");

        entityManager.getTransaction().begin();
        TypedQuery<Venda> query =
                entityManager.createQuery(sb.toString(), Venda.class);
        query.setParameter("codigoProduto", codigoProduto);
        Venda matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Venda buscarPorProduto(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT v FROM Venda v ");
        sb.append("INNER JOIN Produto p on p = v.produto ");
        sb.append("WHERE p = :produto");

        entityManager.getTransaction().begin();
        TypedQuery<Venda> query =
                entityManager.createQuery(sb.toString(), Venda.class);
        query.setParameter("produto", produto);
        Venda venda = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return venda;
    }

    @Override
    public Venda buscarPorCodigoProdutoCriteria(String codigoProduto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Venda> query = builder.createQuery(Venda.class);
        Root<Venda> root = query.from(Venda.class);
        Join<Object, Object> join = root.join("produto", JoinType.INNER);
        query.select(root).where(builder.equal(join.get("codigo"), codigoProduto));

        TypedQuery<Venda> tpQuery =
                entityManager.createQuery(query);
        Venda venda = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return venda;
    }

    @Override
    public Venda buscarPorProdutoCriteria(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Venda> query = builder.createQuery(Venda.class);
        Root<Venda> root = query.from(Venda.class);
        Join<Object, Object> join = root.join("produto", JoinType.INNER);
        query.select(root).where(builder.equal(join, produto));

        TypedQuery<Venda> tpQuery =
                entityManager.createQuery(query);
        Venda venda = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return venda;
    }

    @Override
    public List<Venda> buscarTodos() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Venda> query = builder.createQuery(Venda.class);
        Root<Venda> root = query.from(Venda.class);
        query.select(root);

        TypedQuery<Venda> tpQuery =
                entityManager.createQuery(query);
        List<Venda> list = tpQuery.getResultList();

        entityManager.close();
        entityManagerFactory.close();
        return list;
    }

    @Override
    public void excluir(Venda venda) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        venda = entityManager.merge(venda);
        entityManager.remove(venda);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
