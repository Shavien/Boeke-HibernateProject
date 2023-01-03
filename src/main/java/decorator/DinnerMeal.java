package decorator;

import dao.MenuDao;
import entities.Menu;

public class DinnerMeal implements SpecialMeal {


    @Override
    public void getMeal(Menu menuInsert) {
        System.out.println("WarmeMaltijd bestaat uit: " + menuInsert.getDinner());
    }
}
