package Java;

class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        UberX uberX = new UberX("AMSQ123", new Account("Andres Herrera", "AND123")); //Instanciando objeto
        uberX.passenger = 3;
        uberX.printDataCar();
        // car.license = "AMQ123 ";
        // car.driver ="Andres Herrera";
        // System.out.println("Car License: " + car.license);

        // Car car2 = new Car("QWERTY", new Account("Andrea Herrera", "ANDA123"));
        // car2.passenger = 3;
        // car2.printDataCar();
        // car2.license = "QWERTY ";
        // car2.driver = "Andrea Herrera";
        // System.out.println("Car License: " + car2.license);
        
    }

}