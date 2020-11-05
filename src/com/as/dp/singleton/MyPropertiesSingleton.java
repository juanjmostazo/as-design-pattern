package com.as.dp.singleton;

public class MyPropertiesSingleton {

    private static MyPropertiesSingleton instance;

    public static MyPropertiesSingleton getInstance() {
        if (instance == null) {
            instance = new MyPropertiesSingleton();
        }

        return instance;
    }

    /***
     *
     */

    private String osName;
    private String osVersion;

    private MyPropertiesSingleton() {
        this.osName = System.getProperty("os.name");
        this.osVersion = System.getProperty("os.version");
    }

    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }
}
