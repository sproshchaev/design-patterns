package com.prosoft;

/**
 * Класс TruckFuelFactory
 */
public class TruckFuelFactory extends MachineFactory {

    @Override
    public Fuel getFuel() {
        return new Benzine();
    }

    @Override
    public Machine getMachine() {
        return new TruckMachine();
    }
}
