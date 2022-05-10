package com.prosoft;

/**
 * Паттерн Стратегия (Strategy Pattern) - динамическое управление поведением объекта
 * путем изменения алгоритма UserNameAndPasswordAuthentication() / PhoneNumberAuthentication()
 * Таким образом мы не меняем код PaymentService, а меняем просто стратегию (алгоритм - либо авторизацию
 * по логину и паролю, либо авторизацию по номеру телефона)
 */
public class App {
    public static void main(String[] args) {

        String authentication = "UserNameAndPassword";

        if (authentication.equals("UserNameAndPassword")) {
            PaymentService service = new PaymentService(new UserNameAndPasswordAuthentication());
            service.pay();
        } else {
            PaymentService service = new PaymentService(new PhoneNumberAuthentication());
            service.pay();
        }


    }
}
