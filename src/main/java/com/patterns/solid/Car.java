package com.patterns.solid;
import com.patterns.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements ICar{

    @Override
    public void accelerate() {
        Logger log = LoggerFactory.getLogger(Car.class);

       log.info("accelerating the car");
    }

    @Override
    public void stop() {
        Logger log = LoggerFactory.getLogger(Car.class);
        log.info("stopping the car");
    }
}
