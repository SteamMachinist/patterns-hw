package main.java.steammachinist.proxy;

public class DatabaseConnectionProxy implements DatabaseConnection {

    private final DatabaseConnectionImpl databaseConnection;
    private final String host;

    public DatabaseConnectionProxy(DatabaseConnectionImpl databaseConnection, String host) {
        this.databaseConnection = databaseConnection;
        this.host = host;
    }

    @Override
    public void connect() {
        databaseConnection.setHost(this.host);
        databaseConnection.connect();
    }
}
