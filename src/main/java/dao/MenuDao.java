package dao;

import configuration.JPAConfig;
import entities.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class MenuDao {

    private EntityManager entityManager = JPAConfig.getEntityManager();

    public Menu insertMenu(Menu menu){
        entityManager.getTransaction().begin();
        entityManager.persist(menu);
        entityManager.getTransaction().commit();
        return menu;
    }

    public Menu findByMorningMeal(String morning_meal ){
        entityManager.getTransaction().begin();
        String jpql  = "SELECT m from Menu m WHERE m.breakfast = :morning_meal";
        TypedQuery<Menu> query = entityManager.createQuery(jpql,Menu.class);
        Menu menu = query.setParameter("morning_meal",morning_meal).getSingleResult();
        entityManager.getTransaction().commit();
        return menu;
    }

    public Menu findByDinnerMeal(String dinner) {
        entityManager.getTransaction().begin();
        String jpql = "select m from Menu m  where m.dinner = :dinner";
        TypedQuery<Menu> query = entityManager.createQuery(jpql, Menu.class);
        Menu menu = query.setParameter("dinner", dinner).getSingleResult();
        entityManager.getTransaction().commit();
        return menu;
    }


}
