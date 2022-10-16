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
            int restRandom3 = random3 % 1000;
            random3 -= restRandom3;
            int randomValue = random3;

            int random4 = (int) (Math.random() * maxValue);
            int randomMilleage = random4;

            String segment[] = {"premium", "standard", "budget"};
            int random5 = (int) (Math.random() * segment.length);
            String randomSegment = segment[random5];

            int maxRange = 9;
            String brakes;
            int random6 = (int) (Math.random() * maxRange);
            if (random6 > 5) {
                    brakes = "Brakes need to be fixed";
            } else {
                    brakes = "Brakes are in a good condition.";
            }

            String suspension;
            int random7 = (int) (Math.random() * maxRange);
            if (random7 > 5) {
                    suspension = "Suspension need to be fixed!";
            } else {
                    suspension = "Suspension is in a good condition.";
            }

            String engine;
            int random8 = (int) (Math.random() * maxRange);
            if (random8 > 5) {
                    engine = "Engine need to be fixed!";
            } else {
                    engine = "Engine is in a good condition.";
            }

            String carBody;
            int random9 = (int) (Math.random() * maxRange);
            if (random9 > 5) {
                    carBody = "Car body need to be fixed!";
            } else {
                    carBody = "Car body is in a good condition.";
            }

            String gearBox;
            int random10 = (int) (Math.random() * maxRange);
            if (random10 > 5) {
                    gearBox = "Gearbox need to be fixed!";
            } else {
                    gearBox = "Gearbox is in a good condition.";
            }

            return new Car(randomBrand, randomModel, randomValue, randomMilleage, randomSegment, brakes, suspension, engine, carBody, gearBox);
        }
}