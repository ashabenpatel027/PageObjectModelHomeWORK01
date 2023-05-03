package org.example;

import org.openqa.selenium.By;


public class RegisterPage extends Utils{

   private By _firstName = By.xpath("//input[@id='FirstName']");
   private By _lastName =By.xpath("//input[@id='LastName']");
   private By _EmailAddress   = By.xpath("//input[@id='Email']");
   private By _password =By.xpath("//input[@id='Password']");
    private By _confirmPassword =By.xpath("//INPUT[@ID=\"ConfirmPassword\"]");
   private By _registerSubmitButton =By.id("register-button");

   public  void enterRegistrationDetails() {

        //type first name
        typeText(_firstName,"FirstName");
        //type last name
        typeText(_lastName, "lastName");
        //type email address
        typeText(_EmailAddress, "ash@gmail.com");
        //type password
        typeText(_password,"test123");
        //type confirm password
        typeText(_confirmPassword, "test123");
        //click on register submit button
        clickOnElement(_registerSubmitButton);

    }
   public void enterRegistrationDetails01 (){

        typeText(_firstName,"FirstName");
        //type last name
        typeText(_lastName, "lastName");
        //type email address
        typeText(_EmailAddress, "kam@gmail.com");
        //type password
        typeText(_password,"asha1234");
        //type confirm password
        typeText(_confirmPassword, "asha1234");
        //click on register submit button
        clickOnElement(_registerSubmitButton);

    }
   public void enterRegistrationDetails02 () {

       typeText(_firstName, "FirstName");
       //type last name
       typeText(_lastName, "lastName");
       //type email address
       typeText(_EmailAddress, "ash32@gmail.com");
       //type password
       typeText(_password, "asha1234");
       //type confirm password
       typeText(_confirmPassword, "asha1234");
       //click on register submit button
       clickOnElement(_registerSubmitButton);
   }}
