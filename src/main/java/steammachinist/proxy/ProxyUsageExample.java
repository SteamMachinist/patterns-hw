package main.java.steammachinist.proxy;

public class ProxyUsageExample {

    public static void run() {
        System.out.println("\n\nProxy usage example:");
        DatabaseConnectionImpl database = new DatabaseConnectionImpl("prod-db");
        DatabaseConnectionProxy databaseProxy = new DatabaseConnectionProxy(database, " localhost:5050/");
        databaseProxy.connect();
    }
}
