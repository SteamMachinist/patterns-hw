package main.java.steammachinist.factory;

public class CoffeeMachine {

    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void orderCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);
        printPrice(coffee);
        brewCoffee(coffee);
    }

    private void printPrice(Coffee coffee) {
        System.out.printf("Coffee price is: %.2f\n", coffee.getPrice());
    }

    private void brewCoffee(Coffee coffee) {
        System.out.printf("Brewing coffee using %.2f ml of water\n", coffee.getNeededWaterAmount());
    }
}
