package com.prosoft;

public class PaymentService {

  private Authentication authAlgorithm;

  public PaymentService(Authentication authAlgorithm) {
      this.authAlgorithm = authAlgorithm;
  }

  public void pay() {
      UserInfo user = authAlgorithm.authenticate();
      System.out.println(".pay completed");
  }

}
