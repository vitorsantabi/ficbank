package repository_jpa;

import factory.ContaFactory;
import jakarta.persistence.EntityManager;
import model.conta.Conta;

import java.util.List;

public class ContasRepository {
    private static EntityManager entityManager;

    public static void saveAccount(Conta conta){
        entityManager = ContaFactory.configFactoryConta();
        try{
            entityManager.persist(conta);
            ContaFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            entityManager.getTransaction().rollback();
        }
    }

    public static Conta getById(final int id) {
        entityManager = ContaFactory.configFactoryConta();
        return entityManager.find(Conta.class, id);
    }

    public static List<Conta> listAll(){
        String query = "SELECT c FROM Conta c";
        entityManager = ContaFactory.configFactoryConta();

        return entityManager.createQuery(query, Conta.class).getResultList();
    }

    public static void removeAccountById(final int id) {
        entityManager = ContaFactory.configFactoryConta();
        try {
            Conta conta = getById(id);
            entityManager.remove(conta);
            ContaFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}
