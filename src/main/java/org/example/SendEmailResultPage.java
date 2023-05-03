package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SendEmailResultPage extends Utils {

    static String expectedEmailToFriendMessage = "Only registered customers can use email a friend feature";
    static String expectedUserEmailToFriendMessage = "user can send email";

    public void verifyUserShouldSendEmailTOFriend(){
        //get text message from web element
        String actualMessage =getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedEmailToFriendMessage, "can not sending email");
    }
    public void verifyUserShouldSendEmailTOFriendSuccessful(){
        String actualMessage =getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedEmailToFriendMessage, "user can send email");
    }


}
