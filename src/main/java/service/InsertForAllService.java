package service;

import dao.*;
import entities.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InsertForAllService {

    BoekDao boekDao =  new BoekDao();
    AuteurDao auteurDao = new AuteurDao();
    GenreDao genreDao = new GenreDao();
    StudentenDao studentenDao = new StudentenDao();
    StudentenDetailDao studentenDetailDao = new StudentenDetailDao();
    MenuDao menuDao = new MenuDao();


    public void insertCrudAllTables(){



        Set<Auteur> auteurSet = new HashSet<>();
        Auteur auteur =  Auteur.builder().auteur("Danielle Steel").build();
        auteurSet.add(auteur);
        auteurDao.insertAuteur(auteur);

        Set<Auteur> auteurSet2 = new HashSet<>();
        Auteur auteur2 =  Auteur.builder().auteur("Jk Rwoling").build();
        auteurSet.add(auteur2);
        auteurDao.insertAuteur(auteur2);

        Set<Boek> boekenSet = new HashSet<>();
        Boek boek = Boek.builder().boekNaam("Stille Eer").editie(1).auteur(auteur).build();
        boekenSet.add(boek);
        boekDao.insertBoek(boek);

        Set<Boek> boekenSet2 = new HashSet<>();
        Boek boek2 = Boek.builder().boekNaam("Azkaban").editie(3).auteur(auteur2).build();
        boekenSet.add(boek2);
        boekDao.insertBoek(boek2);


        Set<Genre> genreSet = new HashSet<>();
        Genre genre = Genre.builder().genre("Roman").boek(boek).build();
        genreSet.add(genre);
        genreDao.insertGenre(genre);

        Set<Genre> genreSet2 = new HashSet<>();
        Genre genre2 = Genre.builder().genre("Fantasie").boek(boek).build();
        genreSet.add(genre2);
        genreDao.insertGenre(genre2);

        Set<StudentenDetail> studentenDetailSet = new HashSet<>();
        StudentenDetail studentenDetail = StudentenDetail.builder().telefoonNummer(7289387).emailAdres("siladoekhi@hotmail.com").build();
        studentenDetailSet.add(studentenDetail);
        studentenDetailDao.insertStudentDetail(studentenDetail);


        Set<Menu> menuSet = new HashSet<>();
        Menu menu = Menu.builder().breakfast("brood met beleg en thee").dinner("warme maaltijd").description("Alleen voor Cafetaria").build();
        menuSet.add(menu);
        menuDao.insertMenu(menu);


        Set<Menu> menuSet2 = new HashSet<>();
        Menu menu2 = Menu.builder().breakfast("Crossant").dinner("Pizza").description("Alleen voor Cafetaria, Optie Pizza Toppings").build();
        menuSet.add(menu2);
        menuDao.insertMenu(menu2);


       /* Menu menu = Menu.builder().breakfast("brood met beleg en thee").dinner("warme maaltijd").build();
        menuDao.insertMenu(menu);*/
    }




}
