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
        homePage.clickRegisterLink();
    }

    @Step
    public void setRegisterFirstname(String registerFirstname) {
        registerPage.setRegisterfirstname(registerFirstname);
    }

    @Step
    public void setRegisterMiddlename(String registerMiddlename) {
        registerPage.setRegisterMiddlename(registerMiddlename);
    }

    @Step
    public void setRegisterLastname(String registerLastname) {
        registerPage.setRegisterLastname(registerLastname);
    }

    @Step
    public void setRegisterEmail(String registerEmail) {
        registerPage.setRegisterEmailAddress(registerEmail);
    }

    @Step
    public void setRegisterPassword(String registerPassword) {
        registerPage.setRegisterPassword(registerPassword);
    }

    @Step
    public void setRegisterConfirmationPassword(String registerConfirmationPassword) {
        registerPage.setRegisterPasswordReconfirm(registerConfirmationPassword);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyRegistrationSuccessfullywelcomeMsg() {
        Assert.assertEquals("Thank you for registering with Madison Island.", registerPage.getSuccessfullyRegisteredmessage());
    }

    @Step
    public void verifyRegistrationSuccessfullywelcomeMsgNotDisplayed() {
        Assert.assertNotEquals("Thank you for registering with Madison Island.", registerPage.getSuccessfullyRegisteredmessage());
    }

    public void verifyAlreadyRegisterederrorMsg() {
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", registerPage.getAlreadyregisterederror());

    }

    public void verifyRegisterNotmatchingpasswordsError() {
        Assert.assertTrue(registerPage.getPasswordnotMatchingError());
    }
}
