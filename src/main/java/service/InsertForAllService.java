package service;

import dao.*;
import entities.*;

import java.util.HashSet;
import java.util.Set;

public class InsertForAllService {

    BoekDao boekDao =  new BoekDao();
    AuteurDao auteurDao = new AuteurDao();
    GenreDao genreDao = new GenreDao();
    StudentenDao studentenDao = new StudentenDao();
    StudentenDetailDao studentenDetailDao = new StudentenDetailDao();
    MenuDao menuDao = new MenuDao();


    public void insertCrudAllTables(){

        Set<StudentenDetail> studentenDetailSet = new HashSet<>();
        StudentenDetail studentenDetail = StudentenDetail.builder().telefoonNummer(7289387).emailAdres("siladoekhi@hotmail.com").build();
        studentenDetailSet.add(studentenDetail);
        studentenDetailDao.insertStudentDetail(studentenDetail);

        Set<Studenten> studentenSet = new HashSet<>();
        Studenten studenten = Studenten.builder().achternaam("Doekhi").voornaam("Shavien").studentenDetail(studentenDetail).build();
        studentenSet.add(studenten);
        studentenDao.insertStudent(studenten);


        Set<Auteur> auteurSet = new HashSet<>();
        Auteur auteur =  Auteur.builder().auteur("Danielle Steel").build();
        auteurSet.add(auteur);
        auteurDao.insertAuteur(auteur);

        Set<Boek> boekenSet = new HashSet<>();
        Boek boek = Boek.builder().boekNaam("Stille Eer").editie(1).auteur(auteur).build();
        boekenSet.add(boek);
        boekDao.insertBoek(boek);

        Set<Genre> genreSet = new HashSet<>();
        Genre genre = Genre.builder().genre("Roman").boek(boek).build();
        genreSet.add(genre);
        genreDao.insertGenre(genre);



        Set<Menu> menuSet = new HashSet<>();
        Menu menu = Menu.builder().breakfast("brood met beleg en thee").dinner("warme maaltijd").description("Alleen voor Cafetaria").build();
        menuSet.add(menu);
        menuDao.insertMenu(menu);


       /* Menu menu = Menu.builder().breakfast("brood met beleg en thee").dinner("warme maaltijd").build();
        menuDao.insertMenu(menu);*/
    }




}
