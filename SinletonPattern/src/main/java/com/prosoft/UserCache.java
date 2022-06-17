package com.prosoft;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс UserCache - должен существовать в единственном экземпляре
 */
public class UserCache {

    /**
     * Статическая переменная создается в единственном экземпляре при старте приложения
     */
    private volatile static UserCache instance;

    private final Map<String, UserInfo> users;

    /**
     * Приватный конструктор
     */
    private UserCache() {
        System.out.println("UserCache init started!");
        users = new HashMap<>();
    }

    /**
     * Публичный статический метод, позволяющий получить экземпляр класса
     * Метод потокобезопасный - для исключения двойной инициализации из разных потоков используется synchronized
     *
     * @return
     */
    public static UserCache getInstance() {
        if (instance == null) {
            synchronized (UserCache.class) {
                if (instance == null) {
                    instance = new UserCache();
                }
            }
        }
        return instance;
    }

    /**
     * Публичный метод-заглушка getUserById
     *
     * @param id
     * @return
     */
    public UserInfo getUserById(String id) {
        return new UserInfo(id, "Sergey");
    }

}

