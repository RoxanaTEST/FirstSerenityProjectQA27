package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registeredAlreadywithValidCredentialsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterEmail(Constants.userEmail);
        registerSteps.setRegisterPassword(Constants.userPass);
        registerSteps.clickRegister();
        registerSteps.verifyAlreadyRegisterederrorMsg();

    }

    @Test
    public void registerwithValidCredentialsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterEmail("roxanatestare31@gmail.com");
        registerSteps.setRegisterPassword("Testareplatforma2!");
        registerSteps.clickRegister();
        registerSteps.verifyRegistrationSuccessfullywelcomeMsg("roxanatestare31");

    }

    @Test
    public void registerwithInValidCredentialsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterEmail("abasa71@asta.com");
        registerSteps.setRegisterPassword("kjdjakdkj!");
        registerSteps.clickRegister();
      //  registerSteps.verifyRegistrationSuccessfullywelcomeMsgNOTDISPALYED("bdsjdkjjsdjdjd");
        registerSteps.verifyRegistrationSuccessfullywelcomeMsg("abasa71");
        //new e-mail
    }

    @Test
    public void registerwithEmptyMandatoryFieldsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterEmail("");
        registerSteps.setRegisterPassword("");
        registerSteps.clickRegister();
        registerSteps.verifyInvalidemailderrorMsg();
    }
    @Test
    public void registerwithInvalidEmailAddressTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterEmail("roxanatestaregmailcom");
        registerSteps.setRegisterPassword("hsjsjsjhjskjxjs");
        registerSteps.clickRegister();
        registerSteps.verifyRegisterTextDisplayedwhenRegisteringwithaninvalidFormailemail();



}
}