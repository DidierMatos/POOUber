package Java;

class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AMSQ123", new Account("Andres Herrera", "AND123"));
        // car.license = "AMQ123 ";
        // car.driver ="Andres Herrera";
        car.passenger = 4;
        // System.out.println("Car License: " + car.license);
        car.printDataCar();

        Car car2 = new Car("QWERTY", new Account("Andrea Herrera", "ANDA123"));
        // car2.license = "QWERTY ";
        // car2.driver = "Andrea Herrera";
        car2.passenger = 3;
        // System.out.println("Car License: " + car2.license);
        car2.printDataCar();
    }

}