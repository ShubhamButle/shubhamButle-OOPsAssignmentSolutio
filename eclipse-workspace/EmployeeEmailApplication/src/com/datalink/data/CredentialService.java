package com.datalink.data;
import java.util.*;

public class CredentialService {

  public String companyName = ".dataLink.com";
	
  public char[] generatePassword(int length) {

    String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
    String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String number = "0123456789";
    String specialChar = "@!#$()*-_<>";
    String combine = capitalLetter + lowerLetter + number + specialChar;
    

    Random random = new Random();

    char[] password = new char[length];

    password[0] = lowerLetter.charAt(random.nextInt(lowerLetter.length()));
    password[1] = number.charAt(random.nextInt(number.length()));
    password[2] = capitalLetter.charAt(random.nextInt(specialChar.length()));
    password[3] = specialChar.charAt(random.nextInt(specialChar.length()));

    for (int i = 4; i < length; i++)

    {

      password[1] = combine.charAt(random.nextInt(combine.length()));

    }

    return password;

  }

  public String generateEmailAddress()

  {
    return this.companyName;
  }

  public void showCredentials()

  {

    String generatedPassword = String.valueOf(generatePassword(8));
    System.out.println("Password-->" + generatedPassword);

  }

}