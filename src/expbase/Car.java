package expbase;

public class Car {
    int id;
    String brand;
    String model;
    int value;
    int milleage;
    String segment;
    String brakes;
    String suspension;
    String engine;
    String carBody;
    String gearBox;

    public Car(String brand, String model, int value, int milleage, String segment, String brakes, String suspension, String engine, String carBody, String gearBox) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.value = value;
        this.milleage = milleage;
        this.segment = segment;
        this.brakes = brakes;
        this.suspension = suspension;
        this.engine = engine;
        this.carBody = carBody;
        this.gearBox = gearBox;
}
    public void printInfo(){
        System.out.println("ID: " + id + "\nBrand: " + this.brand + "\nModel: " + this.model + "\nValue: " + this.value + "\nMilleage: " + this.milleage + "\nSegment: " + this.segment + "\nBrakes: " + this.brakes + "\n" + "Suspension: " + this.suspension + "\n" + "Engine: " + this.engine + "\n" + "carBody: " + this.carBody + "\n" + "gearBox: " + this.gearBox + "\n");
    }
    }
