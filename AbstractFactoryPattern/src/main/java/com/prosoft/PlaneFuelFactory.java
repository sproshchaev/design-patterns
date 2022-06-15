package com.prosoft;

/**
 * Класс PlaneFuelFactory
 */
public class PlaneFuelFactory extends MachineFactory {

    @Override
    public Fuel getFuel() {
        return new Kerosene();
    }

    @Override
    public Machine getMachine() {
        return new PlaneMachine();
    }
}
