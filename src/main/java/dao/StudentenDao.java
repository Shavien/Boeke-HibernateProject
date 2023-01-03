package dao;

import configuration.JPAConfig;
import entities.Auteur;
import entities.Studenten;
import jakarta.persistence.EntityManager;

public class StudentenDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();


    public Studenten insertStudent(Studenten studenten) {
        entityManager.getTransaction().begin();
        entityManager.persist(studenten);
        entityManager.getTransaction().commit();
        return studenten;
    }
}
