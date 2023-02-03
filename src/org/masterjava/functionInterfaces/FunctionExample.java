package org.masterjava.functionInterfaces;

import java.util.function.Function;

public class FunctionExample {
    
    public static void main(String[] args) {

        Function<String, Integer> stringToLength = (s) -> s.length();
        System.out.println("Length of 'Hello World': "+stringToLength.apply("Hello World"));

    }
}
