package com.prosoft;

/**
 * Класс Mp3Announcer
 */
public class Mp3Announcer implements Announcer {
    /**
     * Метод announce озвучивает передаваемый символ
     *
     * @param ch
     */
    @Override
    public void announce(Character ch) {
        if (!canAnnounce(ch)) {
            throw new RuntimeException("Not supported");
        }
        System.out.println("Announcing ch=" + ch + " completed");
    }

    /**
     * Метод canAnnounce озвучивает лишь некоторые символы
     *
     * @param ch
     */
    @Override
    public boolean canAnnounce(Character ch) {
        if (ch.equals('a') || ch.equals('b')) {
            return true;
        } else {
            return false;
        }
    }
}
