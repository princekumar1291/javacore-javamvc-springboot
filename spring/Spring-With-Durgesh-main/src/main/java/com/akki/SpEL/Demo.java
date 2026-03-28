package com.akki.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{ 22+11 }")    // simple expression
    private int x;

    @Value("#{ 1+2+3+4+5 }")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(144) }")  // method as a value
    private double sqrt;

    @Value("#{ T(java.lang.Math).PI }")     // class variable as a value
    private double pi;

    @Value("#{ new java.lang.String('Akash Prajapati') }")  // new Object as a value
    private String myName;

    @Value("#{ 8-4 > 3 }")  // boolean Expression for boolean return type
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSqrt() {
        return sqrt;
    }

    public void setSqrt(double sqrt) {
        this.sqrt = sqrt;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", sqrt=" + sqrt +
                ", pi=" + pi +
                ", myName='" + myName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
