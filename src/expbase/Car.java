package expbase;

public class Car {
    int id;
    String brand;
    String model;
    int value;
    int milleage;
    String segment;

    public Car(String brand, String model, int value, int milleage, String segment) {
        this.brand = brand;
        this.model = model;
        this.value = value;
        this.milleage = milleage;
        this.segment = segment;
    }
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nValue: " + this.value + "\nMilleage: " + this.milleage + "\nSegment: " + this.segment + "\n");
    }
    }
