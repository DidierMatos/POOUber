class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String License, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}