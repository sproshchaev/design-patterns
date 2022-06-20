package com.prosoft;

/**
 * Класс NoOpAnnouncer реализует Default announce
 */
public class NoOpAnnouncer implements Announcer {
    /**
     * Метод announce озвучивает передаваемый символ
     *
     * @param ch
     */
    @Override
    public void announce(Character ch) {
    }

    /**
     * Метод canAnnounce озвучивает все символы
     *
     * @param ch
     */
    @Override
    public boolean canAnnounce(Character ch) {
        return true;
    }
}
