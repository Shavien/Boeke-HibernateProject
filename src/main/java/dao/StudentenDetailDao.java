package dao;

import configuration.JPAConfig;
import entities.Auteur;
import entities.StudentenDetail;
import jakarta.persistence.EntityManager;

public class StudentenDetailDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();


    public StudentenDetail insertStudentDetail(StudentenDetail studentenDetail) {
        entityManager.getTransaction().begin();
        entityManager.persist(studentenDetail);
        entityManager.getTransaction().commit();
        return studentenDetail;
    }
}
