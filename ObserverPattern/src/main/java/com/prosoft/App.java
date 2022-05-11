package com.prosoft;

/**
 * Шаблон Observer Pattern (паттерн Наблюдатель)
 * В системе есть датчик (IObservable) и наблюдатель (IObserver)
 * <p>
 * Модель "Polling" - Наблюдатель через определенные промежутки времени опрашивает датчик для получения актуальных изменений.
 * И хотя датчик не меняет свои показания - его все равно опрашивают.
 * <p>
 * Модель "Push" - датчик (IObservable) сам отправляет данные наблюдателю (IObserver), когда происходит изменение данных.
 * Предварительно наблюдатель должен подписаться.
 */
public class App {

    public static void main(String[] args) throws Exception {

        MachineEngine engine = new MachineEngine();

        final Wheel whell1 = new Wheel("1");
        Wheel whell2 = new Wheel("2");

        whell1.add(engine);
        whell2.add(engine);

        new Thread(() -> whell1.start()).start();
        new Thread(() -> whell2.start()).start();

    }
}
