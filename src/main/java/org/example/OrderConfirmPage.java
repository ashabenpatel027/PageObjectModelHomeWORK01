package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmPage extends  Utils {
   //page for BuildYour own computer Orderconfirm
   By _getMessage = By.cssSelector("div.order-completed div.title strong");
   By _orderNumber = By.cssSelector("div.order-completed div.order-number strong");
   By _continueButton = By.cssSelector("div.buttons button");

   public void getOrderConfirmation() {
      String expectedConfirmOrderMessage = "Your order has been successfully processed!";
      String actualMessage =getTextFromElement(_getMessage);
      System.out.println("result message:" + actualMessage);
      Assert.assertEquals(actualMessage, expectedConfirmOrderMessage, "Your order has been not processed");
      String actualMessage1 =getTextFromElement(_orderNumber);
      System.out.println("confirm:" + actualMessage1);
      clickOnElement(_continueButton);
   }
}
