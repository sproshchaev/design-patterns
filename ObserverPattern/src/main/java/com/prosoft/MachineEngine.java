package com.prosoft;

/**
 * Класс MachineEngine реализует методы интерфейса IObserver
 */
public class MachineEngine implements IObserver {


    /**
     * Метод notify уведомляет об изменении параметра "Скорость" (speed)
     *
     * @param deviceId - номер узла системы (колеса, агрегата и тп.)
     * @param speed    - измеряемый показатель
     */
    @Override
    public void notify(String deviceId, double speed) {
        System.out.println("MachinEngine: deviceId=" + deviceId + " speed changed value=" + speed);
    }
}
