package main.java.steammachinist.factory;

public class CoffeeFactoryUsageExample {
    public static void run() {
        System.out.println("\nCoffee factory usage example:");
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        System.out.println("Order espresso:");
        coffeeMachine.orderCoffee(CoffeeType.ESPRESSO);
        System.out.println("Order americano:");
        coffeeMachine.orderCoffee(CoffeeType.AMERICANO);
    }
}
