package main.java.steammachinist.factory;

public class Americano implements Coffee{
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public double getNeededWaterAmount() {
        return 350;
    }
}
