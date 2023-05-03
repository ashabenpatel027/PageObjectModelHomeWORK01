package org.example;

import org.openqa.selenium.By;

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
}}

   //