package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(ElectricCar.class);
        String carType = "electric";

        ICar car;
        if ("car".equals(carType)) {
            car = new Car();
        } else if ("electric".equals(carType)) {
            car = new ElectricCar();
        }else{
            log.info("Error");
        }

    }
}
