package dao;

import Singleton.SingletonClass;
import configuration.JPAConfig;
import entities.Auteur;
import entities.Boek;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AuteurDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();

    public Auteur insertAuteur(Auteur auteur) {
        entityManager.getTransaction().begin();
        entityManager.persist(auteur);
        entityManager.getTransaction().commit();
        return auteur;
    }

    public Auteur findByAuteurNaam(String auteur_naam){
        entityManager.getTransaction().begin();
        String jpql = "select a from Auteur a  where a.auteur = :auteur_naam";
        TypedQuery<Auteur> query = entityManager.createQuery(jpql, Auteur.class);
        Auteur auteur = query.setParameter("auteur_naam", auteur_naam).getSingleResult();
        entityManager.getTransaction().commit();
        return auteur;
    }


}
