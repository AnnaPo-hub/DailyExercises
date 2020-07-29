package coffeeMachine;

import java.util.Scanner;

import static coffeeMachine.CoffeeMachineInterface.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachineData coffeeMachineData = new CoffeeMachineData();
        while (true) {
            System.out.println("Pls write what you want to do: buy, fill, take, remaining, exit");
            Scanner scan = new Scanner(System.in);
            String optionSelected = scan.nextLine();
            switch (optionSelected) {
                case "buy":
                    System.out.println("Pls enter  1- espresso, 2 - latte or 3 - cappuccino. Or,  if you change your mind, you can type back  for the return to the" +
                            "main menu");
                    String coffeeSelected = scan.next();
                    if (coffeeSelected.equals("back"))
                        break;
                    sellCoffee(coffeeSelected, coffeeMachineData);
                    break;
                case "fill":
                    fillCoffeeMachine(coffeeMachineData);
                    break;
                case "take":
                    takeMoney(coffeeMachineData);
                    break;
                case "remaining":
                    showRemaining(coffeeMachineData);
                    break;
                default:
                    System.out.println("Wrong option or mistype, pls check");
            }
            if (optionSelected.equals("exit")) {
                break;
            }
        }
    }
}
