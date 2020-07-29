package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachineInterface {
    public static void showRemaining(CoffeeMachineData coffeeMachineData) {// copy!
        System.out.println(coffeeMachineData);
    }

    public static void fillCoffeeMachine(CoffeeMachineData coffeeMachineData) {
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
    }

    public static void sellCoffee(int coffeeSelected, CoffeeMachineData coffeeMachineData) {
        final CoffeeAssortment coffeeSelectedLiteral = transformNumberToCoffeeType(coffeeSelected);
        final String ingredientIfAbsent = whatIngredientIsNotEnough(coffeeMachineData, coffeeSelectedLiteral);
        if (ingredientIfAbsent.equals("enough")) {
            System.out.println("I have enough resources, making you a coffee!");
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
        }else {
            System.out.println("Sorry, not enough "+ ingredientIfAbsent+ " !");
        }
    }

    public static void takeMoney(CoffeeMachineData coffeeMachineData) {
        System.out.println("I gave you $" + coffeeMachineData.currAmountOfMoney);
        coffeeMachineData.currAmountOfMoney = 0;
    }

    public static boolean checkIngredientsEnough(CoffeeMachineData coffeeMachineData, CoffeeAssortment coffeeType) { // copy!
        return coffeeMachineData.currAmountOfBeans >= coffeeType.amountOfBeans &&
                coffeeMachineData.currAmountOfCups >= coffeeType.amountOfCups &&
                coffeeMachineData.currAmountOfMilk >= coffeeType.amountOfMilk &&
                coffeeMachineData.currAmountOfWater >= coffeeType.amountOfWater;
    }

    public static String whatIngredientIsNotEnough(CoffeeMachineData coffeeMachineData, CoffeeAssortment coffeeType){
        if (coffeeMachineData.currAmountOfBeans < coffeeType.amountOfBeans)
            return "beans";
          if(coffeeMachineData.currAmountOfCups <coffeeType.amountOfCups)
              return "cup";
            if(coffeeMachineData.currAmountOfMilk <coffeeType.amountOfMilk)
                return "milk";
            if(coffeeMachineData.currAmountOfWater< coffeeType.amountOfWater)
                return "water";
            return "enough";
    }

    public static CoffeeAssortment transformNumberToCoffeeType(int coffeeSelected) {
        switch (coffeeSelected) {
            case 1:
                CoffeeAssortment espresso = new CoffeeAssortment(250, 0, 16, 1, 4);
                return espresso;
            case 2:
                CoffeeAssortment latte = new CoffeeAssortment(350, 75, 20, 1, 7);
                return latte;

            case 3:
                CoffeeAssortment cappuccino = new CoffeeAssortment(200, 100, 12, 1, 6);
                return cappuccino;
        }
        return null;
    }
}

