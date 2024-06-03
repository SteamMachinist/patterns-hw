package main.java.steammachinist.adapter;

public class Computer {
    public void connectToUsbPort(UsbConnector usbConnector) {
        System.out.println("Connecting to usb port...");
        usbConnector.connect();
    }
}
