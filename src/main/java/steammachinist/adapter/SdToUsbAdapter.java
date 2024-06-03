package main.java.steammachinist.adapter;

public class SdToUsbAdapter implements UsbConnector {

    private final SdCardConnector sdCardConnector;

    public SdToUsbAdapter(SdCardConnector sdCardConnector) {
        this.sdCardConnector = sdCardConnector;
    }

    @Override
    public void connect() {
        System.out.println("Using sd to usb adapter...");
        sdCardConnector.connect();
    }
}
