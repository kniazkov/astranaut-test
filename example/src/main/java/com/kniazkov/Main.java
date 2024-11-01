package com.kniazkov;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        Accumulator a = new Accumulator();
        a.add(7);
        a.add(3);
        log.info("sum: " + a.getSum() + ", average: " + a.getAverage());
    }
}
