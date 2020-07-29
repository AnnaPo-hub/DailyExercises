package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachineInterface {
    public static void fillCoffeeMachine(CoffeeMachineData coffeeMachineData) {
        System.out.println(coffeeMachineData);
        System.out.println("Pls advise how many ml of water do you want to add");
        Scanner scan = new Scanner(System.in);
        int waterToAdd = scan.nextInt();
        coffeeMachineData.currAmountOfWater += waterToAdd;
        System.out.println("Pls advise how many ml of milk do you want to add");
        int milkToAdd = scan.nextInt();
        coffeeMachineData.currAmountOfMilk += milkToAdd;
        System.out.println("Pls advise how grams of coffee beans do you want to add");
        int beansToAdd = scan.nextInt();
        coffeeMachineData.currAmountOfBeans += beansToAdd;
        System.out.println("Pls advise how many disposable cups do you want to add");
        int cupsToAdd = scan.nextInt();
        coffeeMachineData.currAmountOfCups += cupsToAdd;
        System.out.println(coffeeMachineData);
    }

    public static void sellCoffee(int coffeeSelected, CoffeeMachineData coffeeMachineData) {
        System.out.println(coffeeMachineData);
        switch (coffeeSelected) {
            case 1:
                coffeeMachineData.currAmountOfMoney += 4;
                coffeeMachineData.currAmountOfWater -= 250;
                coffeeMachineData.currAmountOfBeans -= 16;
                coffeeMachineData.currAmountOfCups -= 1;
                break;
            case 2:
                coffeeMachineData.currAmountOfMoney += 7;
                coffeeMachineData.currAmountOfWater -= 350;
                coffeeMachineData.currAmountOfMilk -= 75;
                coffeeMachineData.currAmountOfBeans -= 20;
                coffeeMachineData.currAmountOfCups -= 1;
                break;
            case 3:
                coffeeMachineData.currAmountOfMoney += 6;
                coffeeMachineData.currAmountOfWater -= 200;
                coffeeMachineData.currAmountOfMilk -= 100;
                coffeeMachineData.currAmountOfBeans -= 12;
                coffeeMachineData.currAmountOfCups -= 1;
                break;
        }
        System.out.println(coffeeMachineData);
    }

    public static void takeMoney(CoffeeMachineData coffeeMachineData) {
        System.out.println(coffeeMachineData);
        System.out.println("I gave you $" + coffeeMachineData.currAmountOfMoney);
        coffeeMachineData.currAmountOfMoney = 0;
        System.out.println(coffeeMachineData);
    }
}
