package org.example;

import org.openqa.selenium.By;

public class CompareProductpage  extends  Utils {
    //Selecting product
    private By _htcM8Android =By.xpath("//img[contains(@alt,'Picture of HTC One M8 Android L 5.0 Lollipop')]");
    //getting xpath for compare product
    private  By _compareProductButton =By.xpath("//div[@class='compare-products']/button");
    //selecting giftCard
    private By _giftCard = By.linkText("Gift Cards");
    private By _VirtualGiftCard =By.linkText("$25 Virtual Gift Card");
    //comparing product
    private By _CompareProductButton =By.xpath("//button[contains(@class,'button-2 add-to-compare-list-button')]");

    private By _ProductComparison = By.linkText("product comparison");
    private By _ClearList = By.className("clear-list");

    public void verifyUserShouldBeCompareAproduct(){
        //This all action calling global into mainMethod

        clickOnElement(_htcM8Android);
        //click compare button
        clickOnElement(_compareProductButton);
        //select product
        clickOnElement(_giftCard);
        clickOnElement(_VirtualGiftCard);
        //click compare product
        clickOnElement(_CompareProductButton);
        //product comparison
        clickOnElement(_ProductComparison);
        clickOnElement(_ClearList);
    }
}
