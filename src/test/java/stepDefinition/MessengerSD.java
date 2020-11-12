package stepDefinition;

import Utils.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.MessengerPage;

public class MessengerSD {

    private MessengerPage messengerPage=new MessengerPage();

    @Given("^I am on messenger page$")
    public void setMessengerPage(){
        messengerPage.clickOnMessengerLink();
        Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://www.messenger.com/");// problem
    }
    @When("^I enter (.+) into (username|password) field on the messenger page$")
    public void enterDataIntoTextField(String value, String textField){

        switch (textField){
            case "username":
                messengerPage.enterEmail(value);
            case "password":
                messengerPage.enterPassword(value);
        }

    }
    @And("^I click login button on messenger page$")
    public void clickOnLoginBtn(){
        messengerPage.clickOnSignInBtn();
    }
    @Then("^I verify invalid login message on sign in page$")
    public void verifySignInErrorMessage(){
        Assert.assertEquals(messengerPage.getErrorMessage(), "Incorrect Email");// problem
    }

}
