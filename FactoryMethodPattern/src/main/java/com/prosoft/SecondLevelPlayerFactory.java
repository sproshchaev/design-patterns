package com.prosoft;

/**
 * Класс SecondLevelPlayerFactory - фабрика создания игроков первого уровня
 */
public class SecondLevelPlayerFactory extends PlayerFactory {

    /**
     * Метод create возвращает игрока второго уровня
     *
     * @return
     */
    @Override
    public Player create() {
        return new SecondLevelPlayer();
    }
}
