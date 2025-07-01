// Java Sample for Something Theme
package com.something.theme;

import java.util.ArrayList;
import java.util.List;

/**
 * A sample Java class to demonstrate syntax highlighting.
 * @author Gemini Code Assist
 */
@SuppressWarnings("unused")
public class Sample<T extends Number> {

    private final String message = "Hello, Java!";
    public static final double PI = 3.14159;

    public void printMessage(T genericValue) {
        System.out.println(message);
        System.out.println("Generic value: " + genericValue);
    }

    public static void main(String[] args) {
        Sample<Integer> sample = new Sample<>();
        sample.printMessage(123);
    }
}