package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.security.Timestamp;

public class BaseTest extends Utils {
    DriverManager driverManager = new DriverManager();
    @BeforeMethod
    public void setup(){
        driverManager.openBrowser();
    }
    @AfterMethod
    public void tearDown() {
     driverManager.closeBrowser();
    }


    }

