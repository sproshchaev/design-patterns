package com.prosoft;

/**
 * Класс PhoneNumberAuthentication
 */
public class PhoneNumberAuthentication implements Authentication{

    @Override
    public UserInfo authenticate() {
        return new UserInfo("1", "Sergey");
    }

    @Override
    public String toString() {
        return "PhoneNumberAuthentication{}";
    }
}
