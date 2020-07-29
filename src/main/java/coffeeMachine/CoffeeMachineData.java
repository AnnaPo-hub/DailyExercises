package coffeeMachine;

public class CoffeeMachineData {
    int currAmountOfMoney = 550;
    int currAmountOfWater = 400;
    int currAmountOfMilk = 540;
    int currAmountOfBeans = 120;
    int currAmountOfCups = 9;

    @Override
    public String toString() {
        return "The coffee machine has: " + "\n" +
                currAmountOfWater + " of water" + "\n" +
                currAmountOfMilk + " of milk " + "\n" +
                currAmountOfBeans + " of coffee beans" + "\n" +
                currAmountOfCups + " of disposable cups" + "\n" +
                currAmountOfMoney + " of money";
    }
}
