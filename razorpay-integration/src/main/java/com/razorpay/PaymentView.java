package com.razorpay;

import io.dropwizard.views.View;

/**
 * 
 * @author Meghna
 * @createdOn 22-Jun-2020
 *
 */

public class PaymentView extends View {

  private int amount;
  private String razorpayOrderId;

  public PaymentView(int amount, String razorpayOrderId) {
    super("/index.ftl");
    this.amount = amount;
    this.razorpayOrderId = razorpayOrderId;
  }

  public int getAmount() {
    return amount;
  }

  public String getRazorpayOrderId() {
    return razorpayOrderId;
  }
}
