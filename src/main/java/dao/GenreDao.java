package dao;

import configuration.JPAConfig;
import entities.Auteur;
import entities.Genre;
import jakarta.persistence.EntityManager;

public class GenreDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();


    public Genre insertGenre(Genre genre) {
        entityManager.getTransaction().begin();
        entityManager.persist(genre);
        entityManager.getTransaction().commit();
        return genre;
    }
}
