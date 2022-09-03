package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest extends BaseTest{
    @Test
    public void displaymyAccountTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.userEmail);
        loginSteps.setPassword(Constants.userPass);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.userName);

    }
}
