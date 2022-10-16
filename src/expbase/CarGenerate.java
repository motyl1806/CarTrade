package expbase;

public class CarGenerate {

    public Car CarGenerate() {

            String brand[] = {"Fiat", "Mercedes", "BMW", "Skoda", "Volkswagen", "Audi", "Alfa Romeo", "Toyota", "Opel", "Lamborghini"};
            int random = (int) (Math.random() * brand.length);
            String randomBrand = brand[random];

            String model[] = {"Astra", "Octavia", "Fabia", "R8", "Gulia", "Golf", "Diablo", "Corolla", "M4", "Benz"};
            int random2 = (int) (Math.random() * brand.length);
            String randomModel = model[random2];

            int maxValue = 100000;
            int random3 = (int) (Math.random() * maxValue);
            int randomValue = random3;

            int random4 = (int) (Math.random() * maxValue);
            int randomMilleage = random4;

            String segment[] = {"premium", "standard", "budget"};
            int random5 = (int) (Math.random() * segment.length);
            String randomSegment = segment[random5];

            return new Car(randomBrand, randomModel, randomValue, randomMilleage, randomSegment);
        }
}