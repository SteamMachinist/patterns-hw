package main.java.steammachinist.factory;

public class Espresso implements Coffee{
    @Override
    public double getPrice() {
        return 180;
    }

    @Override
    public double getNeededWaterAmount() {
        return 50;
    }
}
