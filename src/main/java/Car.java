
public class Car {
        private int id;
        private String brand;
        private String model;
        private int productionYear;
        private boolean isRented;
        private int meterStatus;
        private int gasoline;

        public Car(int id, String brand, String model, int productionYear, boolean isRented, int meterStatus, int gasoline) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.productionYear = productionYear;
            this.isRented = isRented;
            this.meterStatus = meterStatus;
            this.gasoline = gasoline;
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

        public boolean isRented() {
            return isRented;
        }

        public void setRented(boolean rented) {
            isRented = rented;
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
                    ", isRented=" + isRented +
                    ", meterStatus=" + meterStatus +
                    ", gasoline=" + gasoline +
                    '}';
        }
    }


