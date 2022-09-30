package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {
    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage() {
        homePage.clickAccountLink();

    }


    @Step
    public void setRegisterEmail(String registerEmail) {
        homeAccountPage.setRegisterEmailField(registerEmail);
    }

    @Step
    public void setRegisterPassword(String registerPassword) {
        homeAccountPage.setRegisterPasswordField(registerPassword);
    }

    @Step
    public void clickRegister() {
        homeAccountPage.clickRegisterLink();
    }

    public void verifyAlreadyRegisterederrorMsg() {
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", homeAccountPage.getAlreadyregisterederror());
    }
    @Step
    public void verifyRegistrationSuccessfullywelcomeMsg(String username) {
        Assert.assertEquals(("Hello " + username + " (not " + username + "? Log out)"), myAccountPage.getWelcomeText());
    }
    @Step
    public void verifyRegistrationSuccessfullywelcomeMsgNOTDISPALYED(String username) {
        Assert.assertNotEquals(("Hello " + username + " (not " + username + "? Log out)"), myAccountPage.getWelcomeText());
    }
    @Step
    public void verifyInvalidemailderrorMsg() {
        Assert.assertEquals("Error: Please provide a valid email address.", homeAccountPage.getInvalidEmailregisterError());
    }
    @Step
    public void verifyInvalidFormatEmailerrorMsg(String usernamemail) {
        Assert.assertEquals(" Please include an '@'in the email address."+ usernamemail + " is missing an '@'.", homeAccountPage.getInvalidFormatEmailregistererror());
    }
    @Step
    public void verifyRegisterTextDisplayedwhenRegisteringwithaninvalidFormailemail() {
        Assert.assertEquals("Register",homeAccountPage.displayRegistertext());
    }

}

