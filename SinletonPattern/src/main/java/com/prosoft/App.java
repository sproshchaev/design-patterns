package com.prosoft;

/**
 * Шаблон Sinleton Pattern
 * Минусы шаблона (антипаттерн) - Sinleton хранит глобальное состояние, которое можно изменить из любого участка кода.
 * Тестирование Sinleton затруднительно
 * Зависимость от Sinleton не видна в объявлении класса
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserCache cache = UserCache.getInstance();
        System.out.println(cache.getUserById("1"));

        someMethod();
    }

    private static void someMethod() {
        UserCache cache = UserCache.getInstance();
        System.out.println(cache.getUserById("2"));
    }
}
