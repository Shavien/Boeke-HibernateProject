package decorator;

import entities.Menu;

public abstract class SpecialMealDecorator implements SpecialMeal {

    protected SpecialMeal decoratedSpecial;

    public SpecialMealDecorator(SpecialMeal decoratedSpecial) {
        this.decoratedSpecial = decoratedSpecial;
    }

    public void getMeal(Menu menuInsert){
        decoratedSpecial.getMeal(menuInsert);
    }
}

