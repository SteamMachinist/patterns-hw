package main.java.steammachinist;

import main.java.steammachinist.adapter.AdapterUsageExample;
import main.java.steammachinist.factory.CoffeeFactoryUsageExample;
import main.java.steammachinist.proxy.ProxyUsageExample;
import main.java.steammachinist.singleton.SingletonLoggerUsageExample;

public class Main {

    public static void main(String[] args) {
        SingletonLoggerUsageExample.run();
        CoffeeFactoryUsageExample.run();
        AdapterUsageExample.run();
        ProxyUsageExample.run();
    }
}