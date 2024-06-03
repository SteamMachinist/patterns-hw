package main.java.steammachinist.factory;

public class CoffeeFactoryUsageExample {

    public static void run() {
        System.out.println("\n\nCoffee factory usage example:");
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);

        System.out.println("\nOrder espresso:");
        coffeeMachine.orderCoffee(CoffeeType.ESPRESSO);

        System.out.println("\nOrder americano:");
        coffeeMachine.orderCoffee(CoffeeType.AMERICANO);
    }
}
