package com.akki.springbeanlifecycle.usingxml;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting properties");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){     //method name could be anything just signature should be this. mention name of init-method in config.xml
        System.out.println("Inside init()");
    }

    public void destroy() {     //method name could be anything just signature should be this. mention name of init-method in config.xml
        System.out.println("Inside destroy()");
    }
}
