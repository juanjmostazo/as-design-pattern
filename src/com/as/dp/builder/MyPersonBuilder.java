package com.as.dp.builder;

public class MyPersonBuilder {

    private String name;
    private GenderEnum gender;
    private int age;

    public MyPersonBuilder() {

    }

    public MyPersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MyPersonBuilder setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    public MyPersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new RuntimeException("Unable to build person - NULL name");
        }

        if (gender == null) {
            throw new RuntimeException("Unable to build person - NULL gender");
        }

        if (age < 0) {
            throw new RuntimeException("Unable to build person - NULL age");
        }

        Person person = new Person();
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);

        return person;
    }
}
