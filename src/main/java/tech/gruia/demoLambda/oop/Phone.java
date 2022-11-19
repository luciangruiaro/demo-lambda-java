package tech.gruia.demoLambda.oop;

import tech.gruia.demoLambda.fp.Ringer;

public class Phone implements Ringer {

    public String brand;
    public String model;

    public Phone(){};

    @Override
    public void ring() {
        System.out.println("Ring");
    }

}
