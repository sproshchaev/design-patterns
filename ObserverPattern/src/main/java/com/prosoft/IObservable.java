package com.prosoft;

/**
 * Интерфейс IObservable определяет методы для добавления и удаления наблюдателя
 * за датчиком автомобиля (датчик скорости)
 */
public interface IObservable {

    /**
     * Метод add производит добавление IObserver-а (наблюдателя)
     *
     * @param observer
     */
    void add(IObserver observer);

    /**
     * Метод remove производит удаление IObserver-а (наблюдателя)
     *
     * @param observer
     */
    void remove(IObserver observer);

}
