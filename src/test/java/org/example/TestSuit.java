package org.example;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{  // this will call all class here by  different variable
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage= new RegisterResultPage();
    VotePage votePage=new VotePage();
    VoteResultPage voteResultPage =new VoteResultPage();
    SendEmailToFriendPage sendEmailToFriend =new SendEmailToFriendPage();
    SendEmailResultPage sendEmailResultPage =new SendEmailResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoppingCartResult shoppingCartResult = new ShoppingCartResult();
    CompareProductpage compareProductpage = new CompareProductpage();
    CompareProductResultPage compareProductResultPage = new CompareProductResultPage();
    LoginPage loginPage =new LoginPage();
    LogInResultPage logInResultPage =new LogInResultPage();


    @Test
    public  void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registration detail
        registerPage.enterRegistrationDetails();
        //verify user registered successfully
        registerResultPage.verifyUserShouldBeAbleToRegisterSuccessfully();}
        @Test
    public  void verifyUserShouldBeAbleToDoCommunityPoll() {

          //click on Excellent  button
            votePage.enterCummityPollDetails();
            //verify user should click vot button
            voteResultPage.verifyUserShouldVoteToCommunityPoll();
    }
        @Test
    public void verifyUserShouldBeAbleToSendEmailToFriend() {
         // classing class by Method name
        sendEmailToFriend.enterFriendEmailsDetail();
        sendEmailResultPage.verifyUserShouldSendEmailTOFriend();
    }@Test
    public void  verifyUserShouldBeAbleToAddProductToShoppingCart() {
        shoppingCartPage.enterShoppingCardDetails();
        shoppingCartResult.verifyUserShouldBeAbleToShopping();}
    @Test
    public void VerifyUserShouldBeAbleToCompareProduct(){
        compareProductpage.userShouldBeCompareAproduct();
        compareProductResultPage.userShouldBeAbleCompareAproduct();

    }
    @Test
    public  void VerifyUserShouldBeAbleToReferProductToFriend(){
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails01();

        homePage.clickOnRegisterButton();
        loginPage.enterLoginEmail();
        sendEmailToFriend.enterFriendEmailsDetail();
        sendEmailResultPage.verifyUserShouldSendEmailTOFriendSuccessful();
    }
    @Test
    public void verifyRegisterUserShouldBeAbleToVoteSucessfuly(){
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        loginPage.enterLoginEmail();
        votePage.enterCummityPollDetails();
        voteResultPage.verifyUserShouldVoteToCommunityPoll();
    }


}