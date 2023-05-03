package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    //here to enter all action which we can do in home page

    private By _registerButton = By.className("ico-register");
    //private By _LoginButton =By.className("ico-login");



    public void clickOnRegisterButton() {
        //to call in main method
        //click on registerButton
        clickOnElement(_registerButton);
       // clickOnElement(_LoginButton);

    }
    }

