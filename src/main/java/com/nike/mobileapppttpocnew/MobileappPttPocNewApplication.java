package com.nike.mobileapppttpocnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileappPttPocNewApplication {

  public static void main(String[] args) {
    System.setProperty("java.net.preferIPv4Stack" , "true");
    SpringApplication.run(MobileappPttPocNewApplication.class, args);
  }

}
