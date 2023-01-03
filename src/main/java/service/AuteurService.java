package service;

import configuration.JPAConfig;
import dao.AuteurDao;
import dao.BoekDao;
import entities.Auteur;
import entities.Boek;
import jakarta.persistence.EntityManager;

public class AuteurService {

    BoekDao boekDao = new BoekDao();
    AuteurDao auteurDao = new AuteurDao();
    private EntityManager entityManager = JPAConfig.getEntityManager();


    public void AuteurUpdate(){
        Auteur findAuteurNaam = auteurDao.findByAuteurNaam("Danielle Steel");
        Auteur auteurUpdate = Auteur.builder().auteur("JK Rowling").build();
        auteurDao.insertAuteur(auteurUpdate);
        System.out.println("Auteur is GeUpdatet!");
    }



}
