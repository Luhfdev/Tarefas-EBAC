package br.com.luhf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {

    public static void main(String[] args) {
        // Cria o EntityManagerFactory com a unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Cria o EntityManager
        EntityManager em = emf.createEntityManager();

        try {
            // Inicia uma transação
            em.getTransaction().begin();

            // Cria uma nova pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setId(1L);
            pessoa.setNome("João");

            // Persiste a pessoa no banco de dados
            em.persist(pessoa);

            // Commit da transação
            em.getTransaction().commit();

            System.out.println("Pessoa salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha o EntityManager e o EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}