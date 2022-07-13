package com.uoo.example.testiomvncentraltestapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestIoMvnCentralTestApplication {

  public static void main(String[] args) {
    System.out.println(UooNewClass.getJoy());
    SpringApplication.run(TestIoMvnCentralTestApplication.class, args);
  }

}
