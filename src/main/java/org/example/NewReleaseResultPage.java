package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseResultPage  extends  Utils{

    static String expectedGuestSms= "News comment is successfully added.";
    static String expectedGuestMassage = "Guest";

    public  void verifyUserShouldBeAbleToRegisterSuccessfully()
    {
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My message:" + actualMessage);

        Assert.assertEquals(actualMessage, expectedGuestSms, "News comment is successfully added.");//"Guest Window");

        String actualMessage1 =getTextFromElement(By.xpath("(//div[@class='comment-content'] )[6]"));
        System.out.println("My message:"+actualMessage1);
       Assert.assertEquals(actualMessage1,expectedGuestMassage,"Guest");

}}
