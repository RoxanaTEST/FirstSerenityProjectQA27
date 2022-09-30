package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();

    }

    @Step
    public void setLoginEmail(String loginEmail) {
        homeAccountPage.setLoginEmailField(loginEmail);
    }

    @Step
    public void setLoginPassword(String loginPassword) {
        homeAccountPage.setLoginPasswordField(loginPassword);
    }

    @Step
    public void clickLogin() {
        homeAccountPage.clickLoginLink();
    }

    @Step
    public void verifyErrorforlogingInwithAnInvalidpassword(String useremail) {
        Assert.assertEquals("ERROR: The password you entered for the email address " + useremail + " is incorrect. Lost your password?", homeAccountPage.getInvaliPasswordLoginError());
    }

    @Step
    public void verifyErrorforlogingInwithAnInvalidEmail() {
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?", homeAccountPage.getInvalidEmailLoginError());
    }

    @Step
    public void verifyMandatoryFieldserrorwhilelogginginwithInvalidUsername() {
        Assert.assertEquals("Error: Username is required.", homeAccountPage.getInvalidUsernameLoginError());
    }

    @Step
    public void verifyMandatoryFieldserrorwhilelogginginwithInvalidPassword() {
        Assert.assertEquals("ERROR: The password field is empty.", homeAccountPage.getInvalidPasswordLoginError());
    }

    @Step
    public void verifyMandatoryFieldserrorwhilelogginginwithoutcredentials() {
        Assert.assertEquals("Error: Username is required.", homeAccountPage.getInvalidUsernameLoginError());
    }

    @Step
    public void doLogin(String email, String pass) {
        navigateToLoginPage();
        setLoginEmail(email);
        setLoginPassword(pass);
        clickLogin();
    }
}