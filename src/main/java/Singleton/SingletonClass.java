package Singleton;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class SingletonClass {


    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static EntityManager entityManager = factory.createEntityManager();

    public static EntityManager getInstance(){
        return entityManager;

    }

}
