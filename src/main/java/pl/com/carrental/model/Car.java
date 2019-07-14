package pl.com.carrental.model;


public class Car {
    private int id;
    private String brand;
    private String model;
    private int productionYear;
    private int meterStatus;
    private int gasoline;

    public Car(int id, String brand, String model, int productionYear, int meterStatus, int gasoline) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.meterStatus = meterStatus;
        this.gasoline = gasoline;
    }

    public Car(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }


    public int getMeterStatus() {
        return meterStatus;
    }

    public void setMeterStatus(int meterStatus) {
        this.meterStatus = meterStatus;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", meterStatus=" + meterStatus +
                ", gasoline=" + gasoline +
                '}';
    }
}


