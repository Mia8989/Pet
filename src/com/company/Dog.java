package com.company;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.age = 0;
        this.breed =breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }
}
