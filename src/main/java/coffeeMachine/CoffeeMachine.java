package coffeeMachine;

import java.util.Scanner;

import static coffeeMachine.CoffeeMachineInterface.*;

public class CoffeeMachine {

    /**
     * This is  a program that  simulates  a coffee machine. It has a limited supply of everything.
     * Also it counts how much money it gets for selling coffee.
     * The coffee machine has several options: 1) it needs to be able to sell coffee (espresso, latte, cappuccino).
     * 2) the coffee machine should be able to get replenished by a special worker
     * 3) another special worker should be able to take money from the coffee machine.
     * Program can do one of these actions at a time.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Pls write what you want to do: buy, fill or take");
        Scanner scan = new Scanner(System.in);
        String optionSelected = scan.nextLine();
        CoffeeMachineData coffeeMachineData = new CoffeeMachineData();
        switch (optionSelected) {
            case "buy":
                System.out.println("Then if you want to buy coffee pls enter  1- espresso, 2 - latte or 3 - cappuccino");
                int coffeeSelected = scan.nextInt();
                sellCoffee(coffeeSelected, coffeeMachineData);
                break;
            case "fill":
                fillCoffeeMachine(coffeeMachineData);
                break;
            case "take":
                takeMoney(coffeeMachineData);
                break;
        }
    }
}



