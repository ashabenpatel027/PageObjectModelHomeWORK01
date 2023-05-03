package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    // login into main page to log in button
    private By _LoginIco =By.className("ico-login");
    private By _EnterEmail = By.xpath("//input[@class='email']");
    private By _PassWord =By.xpath("//input[@id='Password']");
    private By _LogInButtton = By.xpath("//button[@class='button-1 login-button']");

    public void enterLoginEmail (){
        //click on login button
        clickOnElement(_LoginIco);
        //Type  email address
        typeText(_EnterEmail, "kam@gmail.com");
        //Type password
        typeText(_PassWord ,"asha1234");
        //click on
        clickOnElement(_LogInButtton);

    }
}
