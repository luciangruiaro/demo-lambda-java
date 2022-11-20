package tech.gruia.demoLambda.fi;

@FunctionalInterface
public interface RingerRetType {
    /*
     * using this interfa
     * this interface should have actually one single abstract method and
     * it is called a functional interface
     */
    String ring(String prefix, String suffix);
}
