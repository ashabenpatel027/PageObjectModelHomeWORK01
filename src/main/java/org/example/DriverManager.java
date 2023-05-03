package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class DriverManager  extends  Utils {
    // this all step will run ChoreDriver,get URL,
    // Make Window maximize
    //should not change frequently


    public void openBrowser() {
        driver= new ChromeDriver();
        //type the url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    public void closeBrowser() {
        driver.close();

}}



