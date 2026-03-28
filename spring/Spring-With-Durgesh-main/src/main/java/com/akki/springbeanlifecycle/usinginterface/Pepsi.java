package com.akki.springbeanlifecycle.usinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    //InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        //init-method
        System.out.println("taking pepsi:: init");
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        //destroy-method
        System.out.println("Going to put empty bottle back to shop:: destroy");
    }
}
