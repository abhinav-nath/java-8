package com.codecafe.java8.lambdas.foundation;

import com.codecafe.java8.functionalinterfaces.MyFunctionalInterface;

public class LambdaUnderTheHood {

    public static void main(String[] args) {

        /* Anonymous Inner classes will generate class files
         * check by using javap -c <filename.class>
         * So anonymous inner classes provide the implementation
         * during the compile time only
         */
        MyFunctionalInterface fun1 = new MyFunctionalInterface() {

            @Override
            public void myAbstractMethod() {
                System.out.println("Implementation 1");
            }
        };

        fun1.myAbstractMethod();

        MyFunctionalInterface fun2 = new MyFunctionalInterface() {

            @Override
            public void myAbstractMethod() {
                System.out.println("Implementation 2");
            }
        };

        fun2.myAbstractMethod();

        
        /* 
         * Whereas Lambdas use invokedynamic to provide dynamic implementations
         * during runtime.
         * 
         * invokedynamic is bytecode instruction added in the JVM 
         * since Java 7 to facilitate dynamic method invocation.
         * So the implementation of the abstract method is not present
         * at the compile-time but at the runtime we are providing it
         * using lambda.
         * 
         * Since lambdas create no footprints like anonymous inner classes,
         * they optimize the storage as well.
         * 
         */
        MyFunctionalInterface funLambda = () -> System.out.println("Lambda Implementation");

        funLambda.myAbstractMethod();

    }

}