package com.prosoft;

/**
 * Класс UserNameAndPasswordAuthentication
 */
public class UserNameAndPasswordAuthentication implements Authentication{

    @Override
    public UserInfo authenticate() {
        return new UserInfo("1", "Sergey");
    }

    @Override
    public String toString() {
        return "UserNameAndPasswordAuthentication{}";
    }
}
