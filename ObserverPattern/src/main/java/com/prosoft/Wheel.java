package com.prosoft;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Wheel (Колесо автомобиля) реализует методы интерфейса IObservable
 */
public class Wheel implements IObservable {

    /**
     * Поле класса для хранения идентификатора Id узла (колеса)
     */
    private String id;

    /**
     * Поле класса для хранения всех подписчиков на изменения показаний датчика
     */
    private List<IObserver> observers = new ArrayList<>();

    /**
     * Конструктор класса
     *
     * @param id
     */
    public Wheel(String id) {
        this.id = id;
    }

    /**
     * Метод add производит добавление IObserver-а (наблюдателя)
     *
     * @param observer
     */
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    /**
     * Метод remove производит удаление IObserver-а (наблюдателя)
     *
     * @param observer
     */
    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    /**
     * Метод производит эмуляцию изменений состояний колеса 5 раз
     */
    public void start() {
        int speed = 0;
        for (int i = 0; i < 5; ++i) {
            notifyObservers(speed);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            speed += 20;
        }
    }

    /**
     * Метод notifyObservers производит уведомление всех подписчиков об изменении скорости
     *
     * @param speed
     */
    private void notifyObservers(double speed) {
        for (IObserver observer : observers) {
            observer.notify(id, speed);
        }
    }

}
