package org.masterjava.functionInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
    
}
