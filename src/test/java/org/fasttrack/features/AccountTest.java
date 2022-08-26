package org.fasttrack.features;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest extends BaseTest{
    @Test
    public void displaymyAccountTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(userEmail);
        loginSteps.setPassword(userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(userName);

    }
}
