package main.java.steammachinist.adapter;

public class UsbFlashDrive implements UsbConnector{
    @Override
    public void connect() {
        System.out.println("Connected to usb flash drive");
    }
}
