package com.patterns.creational.prototype;

public class Circle extends Shape{

    private double radio;


    public Circle(){

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
        Circle var = new Circle();
        var.setRadio(this.getRadio());
        var.setColor(this.getColor());
        return var;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                "} " + super.toString();
    }
}
