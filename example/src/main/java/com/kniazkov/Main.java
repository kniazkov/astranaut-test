package com.kniazkov;

public class Main {
    public static void main(String[] args) {
        Accumulator a = new Accumulator();
        a.add(7);
        a.add(3);
        System.out.println("sum: " + a.getSum() + ", average: " + a.getAverage());
    }
}
