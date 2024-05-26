package main.java.steammachinist.singleton;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static volatile Logger instance;

    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");

    private Logger() {}

    public static Logger getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();

            }
            return instance;
        }
    }

    public void classLogg(Object obj, String info) {
        System.out.printf("Log info: %s - %s - %s\n", getCurrentTime(), obj.getClass().getName(), info);
    }

    private String getCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        return currentTime.format(formatter);
    }
}
