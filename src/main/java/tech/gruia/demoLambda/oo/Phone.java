package tech.gruia.demoLambda.oo;

import tech.gruia.demoLambda.fi.Ringer;

public class Phone implements Ringer {

    public String brand;
    public String model;

    @Override
    public void ring() {
        System.out.println("Ring");
    }

}
