package com.as.dp.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        String osName = MyPropertiesSingleton.getInstance().getOsName();
        String osVersion = MyPropertiesSingleton.getInstance().getOsVersion();

        System.out.println("osName='" + osName + "'");
        System.out.println("osVersion='" + osVersion + "'");
    }
}
