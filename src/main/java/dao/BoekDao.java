package dao;

import configuration.JPAConfig;
import entities.Boek;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BoekDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();

    public Boek createBoek(Boek boek){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(boek);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return boek;
    }

    public List<Boek> GetBoekenLijst(){
        entityManager.getTransaction().begin();
        String jpql = "SELECT b FROM Boek b";
        TypedQuery<Boek> query = entityManager.createQuery(jpql,Boek.class);
        List<Boek> boekLijst = query.getResultList();
        entityManager.getTransaction().commit();
        System.out.println(boekLijst);
        return boekLijst;
    }
    public  Boek findByBoekNaam(String boek_naam){
        entityManager.getTransaction().begin();
        String jpql = "select b from Boek b  where b.boekNaam = :boek_naam";
        TypedQuery<Boek> query = entityManager.createQuery(jpql, Boek.class);
        Boek boek = query.setParameter("boek_naam", boek_naam).getSingleResult();
        entityManager.getTransaction().commit();
        return boek;
    }

    public Boek insertBoek(Boek boek) {
        entityManager.getTransaction().begin();
        entityManager.merge(boek);
        entityManager.getTransaction().commit();
        return boek;
    }


    public int updateBoek(Boek boek) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Boek b SET b.boekNaam = :boekNaam WHERE b.boekId = : boekId");
        query.setParameter("boekNaam", boek.getBoekNaam());
        query.setParameter("boekId", boek.getBoekId());
        int rowsUpdated = query.executeUpdate();
        System.out.println(" Entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }

    public int deleteBoek(String boek_naam) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Boek b where b.boekNaam = :boek_naam");
        query.setParameter("boek_naam", boek_naam);
        int rowsDeleted = query.executeUpdate();
        String deletedBoek = boek_naam;
        System.out.println(" Het boek " + deletedBoek + " is verwijderd ");
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

}
