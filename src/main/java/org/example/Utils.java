package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

public class Utils extends BasePage {
    // Reusable method
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
}
    public static  void selectElementByText(By by,String text){
        Select select1 =new Select(driver.findElement(by));
        select1.selectByVisibleText(text);
    }
    public  static  void selectOptionByValue (By by ,String value){
        Select select2 = new Select(driver.findElement(by));
        select2.selectByValue(value);
    }
    public  static  void selectOptionByIndex ( By by,int  index) {
        Select select3 = new Select(driver.findElement(by));
        select3.selectByIndex(index);
    }
   public static void selectDropDownCurrency (By by,String text){
       Select select = new Select(driver.findElement(by));
       select.selectByValue(text);
    }
    public static void selectDropDownElements(By by,String value){
        Select select= new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }
   // public static void clickOnElements(By by,int index) {
     //  driver.findElements(by).contains(index);
   // public static void clickOnElements(By by)

   // public static void clickRadioButton (By by,String value){
       // driver.findElement(clickRadioButton( ));//.click();
       // Select select = new Select(driver.findElement(by));
        // select.selectByVisibleText(value);


   public static void waitForClickable(By by, int timeInSec) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
    wait.until(ExpectedConditions.elementToBeClickable(by));
}}




