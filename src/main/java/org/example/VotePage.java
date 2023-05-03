package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VotePage extends Utils {
    private By _pollanswers = By.id("pollanswers-2");
    private By _vote1 =By.id("vote-poll-1");
    private By _goodSubmitButton =By.id("vote-poll-1");


    public void enterCummityPollDetails(){
     // click on good button
     clickOnElement(_pollanswers);
     clickOnElement(_vote1);
     //Use the selenium wait
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
        //get the text message for web element
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"poll-vote-error\"]")));
    // clickOnElement(_goodSubmitButton);
    }

}
