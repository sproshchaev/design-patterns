package com.prosoft;

/**
 * Класс UserInfo
 */
public class UserInfo {

    private final String id;
    private final String name;

    public UserInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
