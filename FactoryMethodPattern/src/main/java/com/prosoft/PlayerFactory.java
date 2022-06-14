package com.prosoft;

/**
 * Абстрактный класс PlayerFactory - фабрика создания игроков (любого уровня)
 */
public abstract class PlayerFactory {

    /**
     * Метод create возвращает игроков первого уровня и второго
     *
     * @return
     */
    public abstract Player create();
}

