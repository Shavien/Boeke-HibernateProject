package Singleton;

import entities.Auteur;
import jakarta.persistence.EntityManager;

public class TestSingleton {
    EntityManager entityManager = SingletonClass.getInstance();

    public Auteur insertAuteur(Auteur auteur) {
        entityManager.getTransaction().begin();
        entityManager.persist(auteur);
        entityManager.getTransaction().commit();
        return auteur;
    }
}
