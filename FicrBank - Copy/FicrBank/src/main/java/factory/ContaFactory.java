package factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ContaFactory {
    public static EntityManagerFactory emf;

    public static EntityManager configFactoryConta(){
        emf = Persistence.createEntityManagerFactory("Banco-Ficr");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        return em;
    }

    public static void saveAndClose(EntityManager em){
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
