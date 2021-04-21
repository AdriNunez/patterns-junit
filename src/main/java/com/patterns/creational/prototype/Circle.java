package com.patterns.creational.prototype;

public class Circle extends Shape{

    private double radio;


    public Circle(){
        this.radio = radio;
    }

    public Circle(String color, double radio){
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Circle setRadio(double radio) {
        this.radio = radio;
        return this;
    }

    @Override
    public Double area() {
        return Math.PI*radio*radio;
    }

    public Circle cloneCircle() {
        Circle circle = new Circle();
        circle.radio = this.radio;
        return circle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                "} " + super.toString();
    }
}
