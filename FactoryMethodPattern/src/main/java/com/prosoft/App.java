package com.prosoft;

/**
 * Шаблон Factory Method Pattern решает проблему создания различных объектов без указания конкретных классов объектов.
 * Процесс создания объектов делегируется фабрике
 */
public class App {

    /**
     * Создание 10-ти игроков первого или второго уровня.
     * Метод start не изменяется - изменяется только фабрика,
     * передаваемая ему в качестве аргумента FirstLevelPlayerFactory()
     * или SecondLevelPlayerFactory()
     *
     * @param args
     */
    public static void main(String[] args) {
        PlayerFactory factory;
        boolean createFirstLevelPlayer = true;
        if (createFirstLevelPlayer) {
            factory = new FirstLevelPlayerFactory();
        } else {
            factory = new SecondLevelPlayerFactory();
        }
        start(factory);
    }

    /**
     * Метод start создает 10 игроков
     */
    public static void start(PlayerFactory factory) {
        System.out.println("Game started");
        for (int i = 0; i < 10; i++) {
            Player player = factory.create();
            System.out.println(player.toString());
        }
    }
}
