package decorator;

import dao.MenuDao;
import entities.Menu;

public class BookWithMeal extends SpecialMealDecorator {

    public BookWithMeal(SpecialMeal decoratedSpecial) {
        super(decoratedSpecial);
    }

    MenuDao menuDaoGroup = new MenuDao();

    public void getMeal(Menu menuInsert){
        requestMeal(decoratedSpecial);
        Menu menuInsertSpecial = Menu.builder().breakfast("lichte ontbijt").description("Alleen voor lezen en eten").build();
        menuDaoGroup.insertMenu(menuInsertSpecial);
        decoratedSpecial.getMeal(menuInsertSpecial);
    }

    private void requestMeal(SpecialMeal decoratedSpecial){
        System.out.println("meal order: ");
    }
}
