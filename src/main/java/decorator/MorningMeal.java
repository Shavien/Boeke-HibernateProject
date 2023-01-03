package decorator;

import entities.Menu;

public class MorningMeal implements SpecialMeal {


    public void getMeal(Menu menuInsert){
        System.out.println("Ochtendmaal bestaat uit:" + menuInsert.getBreakfast());
    }
}
