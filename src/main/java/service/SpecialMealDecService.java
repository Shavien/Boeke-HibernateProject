package service;

import dao.MenuDao;
import decorator.BookWithMeal;
import decorator.DinnerMeal;
import decorator.MorningMeal;
import decorator.SpecialMeal;

public class SpecialMealDecService {

    public void specialApp(){
        MenuDao menuDao = new MenuDao();
/*        menuDao.findByMorningMeal("brood met beleg en thee");
        menuDao.findByDinnerMeal("warme maaltijd");*/
        SpecialMeal bookMeal = new MorningMeal();

        SpecialMeal morningMeal = new BookWithMeal(new MorningMeal());
        SpecialMeal dinnerMeal = new DinnerMeal();

        System.out.println("Studenten die willen ontbijten en lezen kunnen het ontbijtmenu kiezen");
        bookMeal.getMeal(menuDao.findByMorningMeal("Brood met beleg en thee"));

        System.out.println("\n Studenten die warm willen eten kunnen het dinnermenu kiezen");
        dinnerMeal.getMeal(menuDao.findByDinnerMeal("warme maltijd"));

        morningMeal.getMeal(menuDao.findByMorningMeal("brood met beleg en thee"));

    }
}
