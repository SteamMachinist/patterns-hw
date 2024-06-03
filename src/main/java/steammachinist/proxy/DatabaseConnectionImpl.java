package main.java.steammachinist.proxy;

public class DatabaseConnectionImpl implements DatabaseConnection {

    private final String databaseName;
    private String host;

    public DatabaseConnectionImpl(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        System.out.printf("Connected to %s%s", host, databaseName);
    }

    public void setHost(String host) {
        this.host = host;
    }
}
