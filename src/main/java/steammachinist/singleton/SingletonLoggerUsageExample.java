package main.java.steammachinist.singleton;

public class SingletonLoggerUsageExample {

    public static void run() {
        System.out.println("\nSingleton logger usage example:");
        Thread threadA = new Thread(new LogUserA());
        Thread threadB = new Thread(new LogUserB());
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException ignored) {}
        System.out.flush();
    }

    public static class LogUserA implements Runnable {

        @Override
        public void run() {
            var logger = Logger.getInstance();
            logger.classLogg(this, "running...");
            System.out.println("Logger object in LogUserA: " + logger);
        }
    }

    public static class LogUserB implements Runnable {

        @Override
        public void run() {
            var logger = Logger.getInstance();
            logger.classLogg(this, "running...");
            System.out.println("Logger object in LogUserB: " + logger);
        }
    }
}
