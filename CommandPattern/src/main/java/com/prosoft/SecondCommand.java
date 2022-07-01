package com.prosoft;

/**
 * Класс SecondCommand
 */
public class SecondCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("SecondCommand started!");
        System.out.println("SecondCommand finished");
    }
}
