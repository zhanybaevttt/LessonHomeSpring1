package org.example;

public class Person {
    private String name;
    private String age;

    private String animal;

    public String getAnimal(){
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
