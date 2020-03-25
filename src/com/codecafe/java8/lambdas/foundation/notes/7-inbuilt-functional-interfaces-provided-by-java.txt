--------------------------------------------------
 Inbuilt Functional Interfaces provided by Java 8
--------------------------------------------------

+ In the exercise, we converted the Java 7 code to Java 8 style code.

+ But in Java8Style_Solution_1.java we have one additional overhead - we are using the "Condition" interface.

+ It just contains a method test() which takes in one argument and returns a boolean.

+ So to be able to use lambda expressions do we always first need to create Functional interfaces ?

+ The answer is NO !

+ The Java 8 designers have given built-in Functional Interfaces that can be used in all general purpose scenarios.

+ All the built-in functional interfaces provided by Java are present in java.util.function package.


-------------------------
 The Predicate interface
-------------------------

+ Notice that the Predicate interface has an abstract method test() which takes in one argument and returns a boolean.

	boolean test(T t);

+ We can use Predicate instead of creating a Condition interface.

+ Refer to Java8Style_Solution_2.java for this implementation.


------------------------
 The Consumer interface
------------------------

+ In Java8Style_Solution_2.java, we are doing a System.out.println(p); inside the printConditionally() method.

+ What if we want to pass in the behavior to the printConditionally() method and have it perform that behavior instead of just printing person objects.

+ We will call this printConditionally() method as performConditionally() method and accept one more argument which will have the behavior to be performed.

+ So basically we need a method which takes in a argument but does not return anything.

+ Consumer is a Functional Interface which contains an "accept()" method which does just this.

	void accept(T t);

+ We can pass a behavior and get it executed by the accept() method of the Consumer interface.

+ Refer to Java8Style_Solution_3.java for this implementation.
