package com.kniazkov;

public class Accumulator {
    private int count = 0;
    private double sum = 0;

    public void add(double value) {
        sum += value;
        count++;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        return sum / count;
    }
}
