package Java;

class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        UberX uberX = new UberX("AMSQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic"); //Instanciando objeto
        uberX.setPassenger(4); //solo permite ingresar el valor correcto por tipo de carro
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH234", new Account("Didier Matos", "AND123"));
        uberVan.setPassenger(6);
        // uberX.passenger = 3; // ya no es permitido ya que se hizo privado y ahora se accede con setter y getter
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