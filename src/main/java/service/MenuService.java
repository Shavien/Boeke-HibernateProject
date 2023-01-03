package service;

import configuration.JPAConfig;
import entities.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class MenuService {

    private EntityManager entityManager = JPAConfig.getEntityManager();

    public void retrieveMenuList() {
        entityManager.getTransaction().begin();
        String jpql = "select m from Menu m";
        TypedQuery<Menu> query = entityManager.createQuery(jpql, Menu.class);
        List<Menu> menuList = query.getResultList();
        entityManager.getTransaction().commit();
        System.out.println(menuList);
    }

}
