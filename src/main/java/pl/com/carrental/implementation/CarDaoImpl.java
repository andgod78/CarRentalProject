package pl.com.carrental.implementation;

import pl.com.carrental.model.Car;
import pl.com.carrental.model.carrunner.CarRunner;
import pl.com.carrental.model.dao.CarDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private static CarDaoImpl carDaoImpl = null;

    private EntityManager mgr = CarRunner.getManager();

    public static CarDao getInstance() {
        if (carDaoImpl == null) {
            carDaoImpl = new CarDaoImpl();
        }
        return carDaoImpl;
    }

    @Override
    public void addCar(Car newCar){
        EntityTransaction trx = this.mgr.getTransaction();
        trx.begin();
        mgr.persist(newCar);
        trx.commit();

    }

    @Override
    public void deleteCar(Integer id) {
        EntityTransaction trx = this.mgr.getTransaction();
        trx.begin();
        mgr.remove(id);
        trx.commit();
    }

    @Override
    public Car findById(Integer idToFind) {
        EntityTransaction trx = this.mgr.getTransaction();
        trx.begin();
        Car carFound = mgr.find(Car.class,idToFind);
        trx.commit();

        return carFound;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> findAllCars() {
        EntityTransaction trx = this.mgr.getTransaction();
        trx.begin();
         List<Car> carList = mgr.createQuery("SELECT car FROM Car car").getResultList();
         trx.commit();
        return carList;
    }


}
