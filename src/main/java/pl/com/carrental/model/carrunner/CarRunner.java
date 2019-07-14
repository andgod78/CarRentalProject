package pl.com.carrental.model.carrunner;

import javax.persistence.*;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("mySQL");
        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        System.out.println("Is ok: " + entityManager.isOpen());

        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();
        //findAllVehicales(entityManager);
        tx.commit();
        tx.begin();
        //addOwner(entityManager);
        tx.commit();
        tx.begin();
        //addVehicaleModel(entityManager);
        tx.commit();
        tx.begin();
        addVehicle(entityManager);
        tx.commit();
        tx.begin();
        //removeVehicle(entityManager);
        tx.commit();
        tx.begin();
        //editVehicle(entityManager);
        tx.commit();
        closeProgram(entityManager, entityManagerFactory);


        /*entityManager.close();
        entityManagerFactory.close();
        System.exit(0);*/

    }

    private static void closeProgram(EntityManager entityManager, EntityManagerFactory entityManagerFactory) {
        entityManager.close();
        entityManagerFactory.close();
        System.exit(0);
    }

    private static void editVehicle(EntityManager entityManager) {

        String hql = "update Vehicle set registration_number = :registration_number " +
                " where id = :id";

        Query query = entityManager.createQuery(hql);
        query.setParameter("registration_number", 543262);
        query.setParameter("id", 216);
        query.executeUpdate();


    }

    private static void removeVehicle(EntityManager entityManager) {
        String hql = "delete from Vehicle where id = :id";

        Query query = entityManager.createQuery(hql);
        query.setParameter("id", 214);
        query.executeUpdate();

        //query.setParameter("id", 225);
        //int result = query.executeUpdate();


    }

    private static void addVehicle(EntityManager entityManager) {

        Owner owner = entityManager.getReference(Owner.class,223);
        Vehicale_model vehicaleModel = entityManager.getReference(Vehicale_model.class,218);

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("white");
        vehicle.setProduction_year(2012);
        vehicle.setRegistration_number(897675);
        vehicle.setOwner(owner);
        vehicle.setVehicaleModel(vehicaleModel);

        entityManager.persist(vehicle);

        boolean result = entityManager.contains(vehicle);
        if (result == true) {
            System.out.println("Pojazd dodany do tabeli");
        } else {
            System.out.println("Nie udało się dodać pojazdu");
        }

    }

    private static void addVehicaleModel(EntityManager entityManager) {
        Vehicale_model vehicaleModel = new Vehicale_model();
        vehicaleModel.setName("AUDI");
        entityManager.persist(vehicaleModel);

        boolean result = entityManager.contains(vehicaleModel);
        if (result == true) {
            System.out.println("Model dodany do tabeli");
        } else {
            System.out.println("Nie udało się dodać modelu");
        }


    }

    private static void addOwner(EntityManager entityManager) {

        Owner owner = new Owner("Kaźmierz", "Wielki");
        entityManager.persist(owner);

        boolean result = entityManager.contains(owner);
        if (result == true) {
            System.out.println("Owner dodany do tabeli");
        } else {
            System.out.println("Nie udało się dodać ownera");
        }
    }

    private static void findAllVehicales(EntityManager entityManager) {
        String hql = " from Vehicle";
        Query query = entityManager.createQuery(hql, Vehicle.class);
        List results = query.getResultList();
        System.out.println(results);
    }
}
}
