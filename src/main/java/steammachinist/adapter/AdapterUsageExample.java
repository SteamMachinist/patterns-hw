package main.java.steammachinist.adapter;

public class AdapterUsageExample {
    public static void run() {
        System.out.println("\n\nAdapter usage example:");
        Computer computer = new Computer();
        System.out.println();

        UsbFlashDrive usbFlashDrive = new UsbFlashDrive();
        computer.connectToUsbPort(usbFlashDrive);
        System.out.println();

        SdCard sdCard = new SdCard();
        SdToUsbAdapter sdToUsbAdapter = new SdToUsbAdapter(sdCard);
        computer.connectToUsbPort(sdToUsbAdapter);
    }
}
