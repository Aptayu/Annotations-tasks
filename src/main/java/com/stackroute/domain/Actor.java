package com.stackroute.domain;

public class Actor {
    private int age;
    private String name;
    private String gender;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {return age; }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() { return gender; }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return name; }





    public Actor(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
