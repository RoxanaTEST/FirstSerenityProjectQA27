package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginwithvalidcredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail(Constants.userEmail);
        loginSteps.setLoginPassword(Constants.userPass);
        loginSteps.clickLogin();
        registerSteps.verifyRegistrationSuccessfullywelcomeMsg("roxanatestare");



    }
    @Test
    public void loginwithInvalidcredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail("hjsfdj@gmail.com");
        loginSteps.setLoginPassword("000000000000000000000000000000000000000000000000");
        loginSteps.clickLogin();
        loginSteps.verifyErrorforlogingInwithAnInvalidEmail();

    }


        @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail(Constants.userEmail);
        loginSteps.setLoginPassword("12345as");
        loginSteps.clickLogin();
        loginSteps.verifyErrorforlogingInwithAnInvalidpassword(Constants.userEmail);


    }

    @Test
    public void invalidEmailLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail("jhjj@h3.com");
        loginSteps.setLoginPassword("HFHFJJFKF22");
        loginSteps.clickLogin();
        loginSteps.verifyErrorforlogingInwithAnInvalidEmail();

    }

    @Test
    public void emptyUsernamefieldLoginTest() {

        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail("");
        loginSteps.setLoginPassword("njfsdjkdgk");
        loginSteps.clickLogin();
        loginSteps.verifyMandatoryFieldserrorwhilelogginginwithInvalidUsername();
    }
    @Test
    public void emptyPasswordfieldLoginTest() {

        loginSteps.navigateToLoginPage();
        loginSteps.setLoginEmail(Constants.userEmail);
        loginSteps.setLoginPassword("");
        loginSteps.clickLogin();
        loginSteps.verifyMandatoryFieldserrorwhilelogginginwithInvalidPassword();
    }

    @Test
    public void emptyfieldsLoginTest() {

        loginSteps.navigateToLoginPage();
        loginSteps.clickLogin();
        loginSteps.verifyMandatoryFieldserrorwhilelogginginwithoutcredentials();
    }
}
