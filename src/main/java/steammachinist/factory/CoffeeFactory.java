package main.java.steammachinist.factory;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }
}
