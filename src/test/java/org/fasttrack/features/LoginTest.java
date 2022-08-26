package org.fasttrack.features;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(userEmail);
        loginSteps.setPassword(userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(userName);
    }


    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(userEmail);
        loginSteps.setPassword("12345as");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }

    @Test
    public void invalidLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("jhjj@h3.com");
        loginSteps.setPassword("HFHFJJFKF22");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();

    }

    @Test
    public void emptyfieldsLoginTest() {

        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(" ");
        loginSteps.setPassword(" ");
        loginSteps.clickLogin();
        loginSteps.verifyMandatoryFieldserrorwhilelogginginwithInvalidCredentials();

    }
}
