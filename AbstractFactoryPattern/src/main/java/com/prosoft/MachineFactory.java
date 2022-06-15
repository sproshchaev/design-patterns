package com.prosoft;

/**
 * Абстрактный класс MachineFactory - фабрика (можно реализовать интерфейс)
 */
public abstract class MachineFactory {

    public abstract Fuel getFuel();
    public abstract Machine getMachine();

}
