package expbase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Car Trade Center! You will be able to check the current database, buy, sell, and repair your owned cars. First of all- what is your name?");
        String question1 = scan.nextLine();
        Human human = new Human();
        human.name = question1;
        System.out.println("Nice to meet you " + human.name + ", I hope you will enjoy my game. Your current account balance is: " + human.money);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("You have a few possibilites to choose, please enter the number the one you have choosen.\nType 1 to view generated list of cars.\nType 2 to buy a car");
        int question2 = scan.nextInt();

            if (question2 == 1){
                System.out.println("Generated cars: ");
                for (int i = 1; i <= 5; i++) {
                    CarGenerate CarGenerate = new CarGenerate();
                    Car car = CarGenerate.CarGenerate();
                    car.id = i;
                    car.printInfo();
                }
                System.out.println("Please continue.");
                } else if (question2 == 2){
                    System.out.println("BUY CAR");
                } else {
                System.out.println("Out of range");
                }
        }
        }
