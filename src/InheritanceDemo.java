 class Vehicle {
        protected String brand = "TOYOTA";        // Vehicle attribute
        public void country() {                    // Vehicle method
            System.out.println("Japan!");
        }
    }

    class Car extends Vehicle {
        private String modelName = "RAV 4";    // Car attribute
        public static void main(String[] args) {

            // Create a myCar object
            Car myCar = new Car();

            // Call the country() method (from the Vehicle class) on the myCar object
            myCar.country();

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }