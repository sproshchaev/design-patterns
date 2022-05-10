package com.prosoft;

import java.util.Scanner;

public class PhoneNumberAuthentication implements Authentication {

    @Override
    public UserInfo authenticate() {
        System.out.println("Hello. Please enter phone");
        Scanner scanner = new Scanner(System.in);
        System.out.println("phone >");
        String phone = scanner.nextLine();

        return new UserInfo();

    }
}
