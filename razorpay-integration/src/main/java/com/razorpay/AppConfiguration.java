package com.razorpay;

import io.dropwizard.Configuration;

/**
 * 
 * @author Meghna
 * @createdOn 22-Jun-2020
 *
 */

public class AppConfiguration extends Configuration {

  private String apiKey;

  private String secretKey;

  public String getApiKey() {
    return apiKey;
  }

  public String getSecretKey() {
    return secretKey;
  }

}
