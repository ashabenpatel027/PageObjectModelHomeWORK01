package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewRelease extends Utils{
    private By _newReleaseDetails=By.xpath("//input[@class='enter-comment-title']");
    private By _commentDetail = By.cssSelector("textarea#AddNewComment_CommentText");
    private By _newCommentButton =By.xpath("//button[@name='add-comment']");
    private By _commentButton =By.xpath("//div[@class='comment-list']");


    public void verifyUsherShouldClickOnNewRelease(){
       // clickOnElement(_ClickOnLeaveComment);
        typeText(_newReleaseDetails,"Good");
        typeText(_commentDetail,"Hello");
        clickOnElement(_newCommentButton);

}}
