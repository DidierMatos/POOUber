class UberVan extends Car{
    Map<String, ArrayList<String,Integer>> typeCarAccepted; //representa la marca y el modelo
    ArrayList<String> seatsMaterial; //Material de los asientos

    public UberVan(String License, Account driver, Map<String, ArrayList<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){ //parametro de seleccion de un dato de los tipos de datos que son validos
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}