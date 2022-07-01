package com.prosoft;

/**
 * Класс FirstCommand
 */
public class FirstCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("FirstCommand started!");
        System.out.println("FirstCommand finished");
    }
}
