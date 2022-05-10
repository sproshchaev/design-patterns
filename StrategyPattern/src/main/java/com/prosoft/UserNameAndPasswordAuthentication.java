package com.prosoft;

import java.util.Scanner;

public class UserNameAndPasswordAuthentication implements Authentication {

    @Override
    public UserInfo authenticate() {
        System.out.println("Hello. Please enter login and password");
        Scanner scanner = new Scanner(System.in);
        System.out.println("login >");
        String login = scanner.nextLine();

        System.out.println("password >");
        String password = scanner.nextLine();

        return new UserInfo();

    }
}
