package com.example.demo.Entity;

public class Child {
    private String name;
    private Apple apple;

    public Child() {
    }

    public Child(String name, Apple apple) {
        this.name = name;
        this.apple = apple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", apple=" + apple +
                '}';
    }
}
