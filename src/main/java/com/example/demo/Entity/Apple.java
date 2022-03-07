package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Apple {
    private String name;
    private Float price;

//    autowired 放在不同地方，有不同的影响，放在 private 上面不会直接运行 set 方法
//    除非调用
//    但是如果放在 set 上面，那么会直接运行 set

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
