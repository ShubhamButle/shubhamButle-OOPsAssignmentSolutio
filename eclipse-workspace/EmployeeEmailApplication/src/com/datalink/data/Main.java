package com.datalink.data;

import java.util.Scanner;

public class Main {

  static CredentialService credentialService = new CredentialService();
  static Scanner scanner = new Scanner(System.in);
  static Employee employee = new Employee("Shubham","Butle");

  public static void main(String[] args) {

    String generatedEmail = credentialService.generateEmailAddress();

    System.out.println("Please enter the department from the following");
    System.out.println(" 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
    int department = scanner.nextInt();

    switch (department)

    {

    case 1:

      System.out.println("Email -->" + employee.firstName + employee.lastName + "@tech" + generatedEmail);
      credentialService.showCredentials();
      break;

    case 2:

      System.out.println("Email -->" + employee.firstName + employee.lastName + "@admin" + generatedEmail);
      credentialService.showCredentials();
      break;

    case 3:

      System.out.println("Email -->" + employee.firstName + employee.lastName + "@hr" + generatedEmail);
      credentialService.showCredentials();
      break;

    case 4:

      System.out.println("Email->" + employee.firstName + employee.lastName + "@legal" + generatedEmail);
      credentialService.showCredentials();
      break;

    }

   

  }

}