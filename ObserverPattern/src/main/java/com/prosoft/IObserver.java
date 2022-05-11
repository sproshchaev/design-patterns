package com.prosoft;

public interface IObserver {

    /**
     * Метод notify уведомляет об изменении параметра "Скорость" (speed)
     * @param deviceId - номер узла системы (колеса, агрегата и тп.)
     * @param speed - измеряемый показатель
     */
    void notify(String deviceId, double speed);


}
