package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils {
    //here to enter all action which we can do in home page

    private By _registerButton = By.className("ico-register");
    private By _productTile = By.cssSelector("div.product-grid h2");
    private By _searchButton = By.xpath("//button[@class='button-1 search-box-button']");
    private By _voteButton = By.cssSelector("button#vote-poll-1");
    private By _currencySelector = By.cssSelector("select#customerCurrency");
    private By _productPrice = By.cssSelector("div.product-grid div.prices");
    private By _euroCurrency = By.id("price actual-price");

    private By _searchProductButton = By.cssSelector("input#small-searchterms");
    private By _searchNikePrice = By.cssSelector(" div.item-grid h2");//("div.search-results div.prices");
    private By _nopCommerce = By.partialLinkText("nopCommerce new release!");
    private By _detailsButton = By.xpath("(//a[@href=\"/nopcommerce-new-release\"])[2]");
    private By _buildComputer = By.xpath("(//a[@href=\"/build-your-own-computer\"])[2]");
    private By _clickOnFaceBook = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
    //All for face book
    private By _facebookButton = By.linkText("Facebook");
    private By _welcomeMessage = By.cssSelector("div.topic-block-title h2");

    public void clickOnRegisterButton() {
        //to call in main method//click on registerButton
        clickOnElement(_registerButton);
    }

    public void printOutForTheTitle() {
        List<WebElement> productList = driver.findElements(_productTile);
        for (WebElement e : productList) {
            System.out.println(e.getText());

        }
    }

    public void verifyUserShouldSearchAlertMessage() {
        clickOnElement(_searchButton);
        //Switching to Alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();
    }

    public void verifyUserShouldClickOnVoteButtonAndDoAlertClick() {
        clickOnElement(_voteButton);
        //Switching to Alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please select an answer");
        alert.accept();
    }

    public void verifyUserShouldAbleToClickOnCurrency() {
        clickOnElement(_currencySelector);
        // All product price will print with euro symbol
        selectElementByText(_currencySelector, "Euro");
        System.out.println("Currency will display as customer input");
        List<WebElement> productList1 = driver.findElements(_productPrice);
        for (WebElement e : productList1) {
            System.out.println(e.getText());
        }// All product price will print with dollar symbol
        clickOnElement(_currencySelector);
        selectElementByText(_currencySelector, "US Dollar");
        System.out.println("Currency will display as customer input");
        List<WebElement> productList = driver.findElements(_productPrice);
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }

    public void verifyUserShouldBeAbleEnterProductName() {
        clickOnElement(_searchProductButton);
        //if user input change product name then will see that particular product
        typeText(_searchProductButton, "adidas");
        clickOnElement(_searchButton);
        List<WebElement> productList3 = driver.findElements(_searchNikePrice);
        for (WebElement e : productList3) {
            System.out.println(e.getText());
        }
    }

    public void verifyUserShouldBeClickOnNopCom() {
        clickOnElement(_nopCommerce);
    }

    public void verifyUserShouldBeBuildYourOwnComputer() {
        clickOnElement(_buildComputer);
    }

    public void verifyUsherShouldClickOnFaceBookLogo() {

        String MainWindow = driver.getWindowHandle();
        clickOnElement(_facebookButton);
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }

      public void veryfiUserShouldSeeWelComeMessage () {
            String expectedWelcomeMessage = "Welcome to our store";
            String actualMessage = getTextFromElement(_welcomeMessage);
            System.out.println("get message on Homepage:" + actualMessage);
            //Close URL
            Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");
        }
    }

