package com.prosoft;

/**
 * Шаблон Abstract Factory Pattern
 * Позволяет создавать семейства связанных объектов
 * Пример: светлый фон совместимый с темным текстом и темный фон, совместимый со светлым текстом
 */
public class App {
    public static void main(String[] args) {

        MachineFactory factory1 = new PlaneFuelFactory();
        someMethod(factory1);

        MachineFactory factory2 = new TruckFuelFactory();
        someMethod(factory2);

    }

    /**
     * Метод someMethod
     *
     * @param factory
     */
    public static void someMethod(MachineFactory factory) {
        Fuel fuel = factory.getFuel();
        Machine machine = factory.getMachine();
        System.out.println("Machine=" + machine + " Fuel=" + fuel);
    }

}
