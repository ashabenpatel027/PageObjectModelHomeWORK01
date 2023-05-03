package org.example;

import org.openqa.selenium.By;

public class SendEmailToFriendPage extends Utils {
    //private By _appleProduct=By.xpath("//a[@ href=\\\"/apple-macbook-pro-13-inch\\\"]\"");
    private By _emailAFriend =By.xpath("//div[@class='email-a-friend']");
    private By _EnterFriendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail =By.xpath("//input[@class=\"your-email\"]");
    private By _sendEmailButton =By.xpath("//button[@name='send-email']");

public void enterFriendEmailsDetail(){
    //click on product
    clickOnElement(By.xpath("//a[@title=\"Show details for Apple MacBook Pro 13-inch\"]"));
    //click on email a friend
    clickOnElement(_emailAFriend);
    //Enter friend email
    typeText(_EnterFriendEmail,"testmail+" + timestamp() + "@gmail.com");
    //Enter your email
    typeText(_yourEmail,"kam@gmail.com");
    //click on send email button
    clickOnElement(_sendEmailButton);

}
}
