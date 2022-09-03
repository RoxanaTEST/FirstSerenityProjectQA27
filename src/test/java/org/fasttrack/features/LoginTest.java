package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
        loginSteps.setPassword(Constants.userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.userName);
    }


    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
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
