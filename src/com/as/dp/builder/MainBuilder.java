package com.as.dp.builder;

public class MainBuilder {

    public static void main (String[] args) {
        /***
         * Traditional
         */
        Person leoMessi = new Person();
        leoMessi.setName("Leo Messi");
        leoMessi.setGender(GenderEnum.MALE);
        leoMessi.setAge(33);

        System.out.println(leoMessi.toString());

        /***
         * Design Pattern
         */
        Person rafaNadal = new MyPersonBuilder()
                .setName("Rafa Nadal")
                .setGender(GenderEnum.MALE)
                .setAge(34)
                .build();

        System.out.println(rafaNadal.toString());
    }
}
