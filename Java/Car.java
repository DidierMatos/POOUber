package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger; //private y accediendo con getter y setter

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        // passenger = 3;
        // System.out.println("passenger: " + passenger);
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){ //getter
        return passenger;
    }

    public void setPassenger(Integer passenger){ //setter
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}