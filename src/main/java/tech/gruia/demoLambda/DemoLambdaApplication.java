package tech.gruia.demoLambda;

import tech.gruia.demoLambda.fi.Ringer;
import tech.gruia.demoLambda.fi.RingerRetType;
import tech.gruia.demoLambda.fi.RingerStrArg;
import tech.gruia.demoLambda.fi.RingerTwoStrArg;
import tech.gruia.demoLambda.oo.Phone;

/*
 * OOP is good for a fixed set of operations on things
 * FP is good for a fixed set of things, and as the code evolves, you primarily add new opetations on those existing things
 */

//@SpringBootApplication
public class DemoLambdaApplication {

    public static void main(String[] args) {
        //  SpringApplication.run(DemoLambdaApplication.class, args);

        /*
         * instantiate class, create obj, call method
         */
        Phone myPhone = new Phone();
        myPhone.ring();

        /*
         * call method using an exsiting obj
         */
        ringPhone(myPhone);

        /*
         * in order to use lambda, we start like we are copying the implementation
         * ringPhone(
         *  public void ring() {
         *      System.out.println("Ring");
         *      }
         *  );
         */


        /*
         * so, let's see how we can transform the OOP implementation into a lambda expression
         * 1. remove access level
         * 2. remove name of the method, it's important just what it does
         * 3. remove the return type
         * 4. if the implementation has a single line you can even remove the {}
         * 5. obtain the lambda expression: (argument-list) -> {body}
         * a lambda expression requires a functional interface (aka sam interface)
         * a lambda expression is basically a shortcut to defining the implementation of a functional interface
         * but instead of having to create a class that impelement that interface and
         * implementing the methods and
         * instantiating the class into an object and
         * call that method by using that object
         * it allows you treat code as parameter
         */
        ringPhone(() -> System.out.println("rrriiinnnggg"));

        /*
         *  further, we can make this lambda as a variable of interface's type
         *  then pass that variable as argument
         */
        Ringer lambdaRinger = () -> System.out.println("rrriiinnnggg");
        ringPhone(lambdaRinger);

        /*
         *  let's use a lambda expression that accepts a param
         *  if you have a single param, you can even exclude the ()
         */
        RingerStrArg lambdaRingerStrArg = s -> System.out.println("rrriiinnnggg" + s);
        ringPhoneStrArg(lambdaRingerStrArg);

        /*
         *  let's use a lambda expression that accepts more than a param
         */
        RingerTwoStrArg lambdaRingerTwoStrArg = (p, s) -> System.out.println(p + "rrriiinnnggg" + s);
        ringPhoneTwoStrArg(lambdaRingerTwoStrArg);

        /*
         *  in case the interface has a return type, declared in the interface
         *  if we have a single expression you can exclude the {} and return keyword
         */
        RingerRetType lambdaRingerRetType = (p, s) -> p + "rrriiinnnggg" + s;
        ringPhoneRetType(lambdaRingerRetType);
        RingerRetType lambdaRingerRetType2 = (p, s) -> {
            System.out.println(p + "rrriiinnnggg" + s);
            return p + "rrriiinnnggg" + s;
        };
        ringPhoneRetType(lambdaRingerRetType2);


    }

    static void ringPhone(Ringer ringer) {
        ringer.ring();
    }
    static void ringPhoneStrArg(RingerStrArg ringerStrArg) {
        ringerStrArg.ring("_end");
    }
    static void ringPhoneTwoStrArg(RingerTwoStrArg ringerTwoStrArg) {
        ringerTwoStrArg.ring("start_", "_end");
    }
    static void ringPhoneRetType(RingerRetType ringerRetType) {
        ringerRetType.ring("start_", "_end");
    }


}