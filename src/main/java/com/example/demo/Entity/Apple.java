package com.example.demo.Entity;

public class Apple {
    private String name;
    private Float price;

    public Apple() {
        System.out.println("Default constructor");
    }

    // 如果 constructor 中的 参数是数字类型，那么就会自动转换
    public Apple(String name, Float price) {
        System.out.println("Customized constructor");
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
