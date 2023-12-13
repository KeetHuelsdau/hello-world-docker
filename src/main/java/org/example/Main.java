package org.example;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int count = 0;
        int a = 5;
        System.out.println("Jetzt gehts endlich los" + a);
        while (true) {
            Thread.sleep(2 * 1000);
            System.out.println(format("App running continuously ... %d", count++));
        }
    }
}
