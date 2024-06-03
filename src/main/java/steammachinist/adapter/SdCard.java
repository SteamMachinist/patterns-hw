package main.java.steammachinist.adapter;

public class SdCard implements SdCardConnector {
    @Override
    public void connect() {
        System.out.println("Connected to sd card");
    }
}
