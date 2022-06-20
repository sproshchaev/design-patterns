package com.prosoft;

/**
 * Шаблон Null Object Pattern, пример №2
 * Плюсы использования паттерна: Уменьшается количество проверок на null, повышается читаемость кода,
 * уменьшается вероятность появления NullPointerException
 */
public class App {
    public static void main(String[] args) {
        MusicService musicService = new MusicService();
        musicService.play("abc");

    }
}
