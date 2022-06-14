package com.prosoft;

/**
 * Класс FirstLevelPlayerFactory - фабрика создания игроков первого уровня
 */
public class FirstLevelPlayerFactory extends PlayerFactory {

    /**
     * Метод create возвращает игрока первого уровня
     *
     * @return
     */
    @Override
    public Player create() {
        return new FirstLevelPlayer();
    }
}
