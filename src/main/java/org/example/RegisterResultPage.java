package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {


    static String expectedRegistrationCompleteMsg = "Thanks for registration";

    public  void verifyUserShouldBeAbleToRegisterSuccessfully()
    {
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedRegistrationCompleteMsg, "Thanks for registration");
    }

}
