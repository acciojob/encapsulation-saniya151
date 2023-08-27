package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        // Try setting a value directly (Task 4)
        // rw.name = "John"; // This will give an error

        // Try printing the value (Task 4)
        // System.out.println(rw.name); // This will give an error

        // Use setter to set the value (Task 6)
        rw.setName("John");

        // Use getter to access the value (Task 6)
        System.out.println("Name: " + rw.getName());
    }
}
