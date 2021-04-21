package com.patterns.solid;

import com.patterns.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricCar implements ICar{

    private int battery;
    Logger log = LoggerFactory.getLogger(ElectricCar.class);
    @Override
    public void accelerate() {
        if (hasBattery()) {
            log.info("accelerating the car");
        } else {
           log.info("I can't accelerate the car");
        }
    }

    @Override
    public void stop() {

        log.info("stopping the car");
    }

    public boolean hasBattery() {
        log.info("checking the battery");
        if (battery < 95) {
            log.info("the battery is very low");
            return false;
        } else {
            log.info("battery ok");
            return true;
        }
    }
}
