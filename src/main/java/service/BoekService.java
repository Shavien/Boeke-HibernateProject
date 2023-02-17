package service;

import configuration.JPAConfig;
import dao.BoekDao;
import entities.Boek;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.awt.print.Book;
import java.util.List;

public class BoekService {
    BoekDao boekDao = new BoekDao();
    private EntityManager entityManager = JPAConfig.getEntityManager();

    public Boek createBoek(Boek boek) {
        return boekDao.createBoek(boek);
    }

    public void BoekUpdate(){
        Boek findBoekNaam = boekDao.findByBoekNaam("Stille Eer");
        findBoekNaam.setBoekNaam("Harry Potter");
        boekDao.updateBoek(findBoekNaam);
    }
//    public void BoekRetrieve(){
//        Boek boekSelect = boekDao.findByBoekNaam("Harry Potter");
//        System.out.println("Opgehaald: " + boekSelect);
//    }

    public List<Book> BookList(){
        boekDao.GetBoekenLijst();
        return null;
    }

    public void boekDelete(){
        boekDao.deleteBoek("Azkaban");

        ////////////////// veranderd in bookDao
/*        Boek deletedBoek = boekDao.findByBoekNaam("Azkaban");
        System.out.println("Het boek genaamd: " + deletedBoek + "is verwijderd");*/
    }

    public void BoekZoeker(String book) {
        entityManager.getTransaction().begin();
        String jpql = "select b from Boek b where b.boekNaam = :boekNaam";
        TypedQuery<Boek> query = entityManager.createQuery(jpql, Boek.class);
        Boek boek = query.setParameter("boekNaam", book).getSingleResult();
        entityManager.getTransaction().commit();
        System.out.println(" Het boek " + book + " komt voor in de bieb! ");
        return;
    }
}
