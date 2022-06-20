package com.prosoft;

/**
 * Класс MusicService
 */
public class MusicService {

    private Announcer standardAnnouncer = new Mp3Announcer();

    /**
     * Метод play
     *
     * @param text
     */
    public void play(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            getAnnouncer(ch).announce(ch);
        }
    }

    /**
     * Метод getAnnouncer
     *
     * @param ch
     * @return
     */
    private Announcer getAnnouncer(char ch) {
        if (standardAnnouncer.canAnnounce(ch)) {
            return standardAnnouncer;
        } else {
            return new NoOpAnnouncer();
        }
    }

}
