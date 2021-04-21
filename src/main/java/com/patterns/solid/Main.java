package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws CarException {

        String carType = "electric";

        ICar car;
        if ("car".equals(carType)) {
            car = new Car();
        } else if ("electric".equals(carType)) {
            car = new ElectricCar();
        }else{
            throw new CarException();
        }
        car.accelerate();
    }
}
