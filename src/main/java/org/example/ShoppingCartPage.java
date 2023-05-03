package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    private By _electronics = By.xpath("//img[contains(@alt,'Picture for category Electronics')]");
    private By _cameraPhoto = By.xpath("//img[contains(@alt,'Picture for category Camera & photo')]");
    private By _leicaCamera = By.linkText("Leica T Mirrorless Digital Camera");
    private By _addToCart = By.id("add-to-cart-button-16");
    private By _shoppingCart = By.linkText("Shopping cart");

  public void enterShoppingCardDetails() {
      //click the electronics
      clickOnElement(_electronics);
      // click the camera & photo
      clickOnElement(_cameraPhoto);
      //select the product and click it
      clickOnElement(_leicaCamera);
      //click on add to cart button
      clickOnElement(_addToCart);
      //check the selected same product have in shopping cart
      clickOnElement(_shoppingCart);
  }}





