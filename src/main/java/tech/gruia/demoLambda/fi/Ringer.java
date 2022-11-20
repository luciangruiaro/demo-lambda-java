package tech.gruia.demoLambda.fi;

// this is not mandatory, but it is recommended, so the compiler will enforce the class to have only one abstract method
@FunctionalInterface // aka sam-interfaces (sam stands for single abstract method)
public interface Ringer { // has only one abstract method => functional interface
    void ring(); // method has no implementation -> abstract method
//  if we try to uncomment the method below, the compiler will warn us
//    void anotherMethod();
}
