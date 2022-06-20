package com.prosoft;

/**
 * Интерфейс Announcer
 */
public interface Announcer {

    /**
     * Метод announce озвучивает передаваемый символ
     *
     * @param ch
     */
    void announce(Character ch);

    /**
     * Метод canAnnounce озвучивает лишь некоторые символы
     *
     * @param ch
     */
    boolean canAnnounce(Character ch);

}
