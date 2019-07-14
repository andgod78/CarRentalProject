import java.util.ArrayList;
import java.util.List;

public class CarRental {
    public static List<Car> createCars(){
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car(1,"Fiat","126p",1982,true,999999,1));
        carList.add(new Car(2,"Skoda","Fabia",1999,false,129873,20));
        carList.add(new Car(3,"BMW","E39",2000,false,781982,30));
        carList.add(new Car(1,"Opel","Calibra",1992,false,876122,45));
        carList.add(new Car(1,"Toyota","Yaris",2014,true,12000,60));
        carList.add(new Car(1,"WV","Passat",2018,false,200000,10));
        return carList;
    }
}
