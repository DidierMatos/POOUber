package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted; //representa la marca y el modelo
    ArrayList<String> seatsMaterial; //Material de los asientos

    private Integer passenger;
    
    public UberVan(String license, Account driver){ //parametro de seleccion de un dato de los tipos de datos que son validos
        super(license, driver);
    }

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){ //parametro de seleccion de un dato de los tipos de datos que son validos
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override //sobreescribiendo metodo para generar el polimorfismo
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}