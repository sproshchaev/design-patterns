package com.prosoft;

/**
 * Шаблон Null Object Pattern, пример №1
 * Плюсы использования паттерна: Уменьшается количество проверок на null, повышается читаемость кода,
 * уменьшается вероятность появления NullPointerException
 */
public class App {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(new PhoneNumberAuthentication());
        paymentService.pay();

        PaymentService paymentService2 = new PaymentService(null);
        paymentService2.pay();

        PaymentService paymentService3 = new PaymentService();
        paymentService3.pay();


    }
}
