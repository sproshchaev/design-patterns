package com.prosoft;

/**
 * класс PaymentService
 */
public class PaymentService {

    private final Authentication authentication;

    /**
     * Конструктор класса
     */
    public PaymentService(Authentication authentication) {
        this.authentication = getAuthentication(authentication);
    }

    /**
     * Конструктор класса без аргументов
     */
    public PaymentService() {
        this.authentication = getAuthentication(null);
    }

    /**
     * Метод pay
     */
    public void pay() {
        UserInfo userInfo = authentication.authenticate();
        String authType = authentication.toString();
        System.out.println(".pay completed authType=" + authType + " user=" + userInfo);
    }

    private Authentication getAuthentication(Authentication authentication) {
        if (authentication != null) {
            return authentication;
        }
        return new UserNameAndPasswordAuthentication();
    }

}
