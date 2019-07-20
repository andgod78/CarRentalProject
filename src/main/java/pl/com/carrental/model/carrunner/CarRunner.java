package pl.com.carrental.model.carrunner;

import javax.persistence.*;

public class CarRunner {

    private static EntityManager entityManager = null;

    public static EntityManager getManager() {

        if (entityManager == null) {

            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("mySQL");
            EntityManager entityManager1 =
                    entityManagerFactory.createEntityManager();

            System.out.println("Is ok: " + entityManager.isOpen());

            return entityManager1;
        }
        return entityManager;

    }
}
