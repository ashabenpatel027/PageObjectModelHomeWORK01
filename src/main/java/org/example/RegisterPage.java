package org.example;

import org.openqa.selenium.By;


public class RegisterPage extends Utils{

   private By _firstName = By.xpath("//input[@id='FirstName']");
   private By _lastName =By.xpath("//input[@id='LastName']");
   private By _dayOfBirth =By.xpath("//select[@name='DateOfBirthDay']");
    private By _monthOfYear = By.xpath("//select[@name='DateOfBirthMonth']");
   private By _birthOfYear =By.xpath("//select[@name='DateOfBirthYear']");
   private By _EmailAddress   = By.xpath("//input[@id='Email']");
   private By _password =By.xpath("//input[@id='Password']");
   private By _confirmPassword =By.xpath("//INPUT[@ID=\"ConfirmPassword\"]");
   private By _registerSubmitButton =By.id("register-button");

   public  void enterRegistrationDetails() {

        //type first name
        typeText(_firstName,"FirstName");
        //type last name
        typeText(_lastName, "lastName");
       //D.O.B can use text or value
       selectOptionByValue(_dayOfBirth,"6");
       //MONTH.called index bcz its countable
       selectOptionByIndex(_monthOfYear,4);
       //year. called value
       selectOptionByValue(_birthOfYear,"1981");
        //type email address
        typeText(_EmailAddress, "ash0@gmail.com");
        //type password
        typeText(_password,"test123");
        //type confirm password
        typeText(_confirmPassword, "test123");
        //click on register submit button
        clickOnElement(_registerSubmitButton);

    }


   }
