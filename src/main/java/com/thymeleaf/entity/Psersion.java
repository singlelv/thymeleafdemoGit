package com.thymeleaf.entity;

public class Psersion {

    private  String name;

    private  Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Psersion(String name , Integer age){
        this.name=name;
        this.age=age;
    }
}
