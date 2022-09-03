package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerwithValidCredentialsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterFirstname("ANA");
        registerSteps.setRegisterMiddlename("MARIA");
        registerSteps.setRegisterLastname("POPA");
        registerSteps.setRegisterEmail("anamaria.po@gmail.com");
        registerSteps.setRegisterPassword("1234567");
        registerSteps.setRegisterConfirmationPassword("1234567");
        registerSteps.clickRegister();
        registerSteps.verifyRegistrationSuccessfullywelcomeMsg();


    }

    @Test
    public void registeredAlreadyemailtest() {

        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterFirstname(Constants.firstName);
        registerSteps.setRegisterMiddlename(Constants.middleName);
        registerSteps.setRegisterLastname(Constants.lastName);
        registerSteps.setRegisterEmail(Constants.userEmail);
        registerSteps.setRegisterPassword(Constants.userPass);
        registerSteps.setRegisterConfirmationPassword(Constants.userPass);
        registerSteps.clickRegister();

        registerSteps.verifyAlreadyRegisterederrorMsg();

    }

    @Test
    public void invalidcredentialsRegistertest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterFirstname("skdkjjd");
        registerSteps.setRegisterMiddlename("hjdjdj");
        registerSteps.setRegisterLastname("hdjdj");
        registerSteps.setRegisterEmail("jdkdlld@sks.com");
        registerSteps.setRegisterPassword("ghdshdd");
        registerSteps.setRegisterConfirmationPassword("ghdshdd");
        registerSteps.clickRegister();

        registerSteps.verifyRegistrationSuccessfullywelcomeMsg();

    }
    @Test
    public void passwordsNotmatchRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterFirstname(Constants.firstName);
        registerSteps.setRegisterMiddlename(Constants.middleName);
        registerSteps.setRegisterLastname(Constants.lastName);
        registerSteps.setRegisterEmail(Constants.userEmail);
        registerSteps.setRegisterPassword(Constants.userPass);
        registerSteps.setRegisterConfirmationPassword("gdfhjdjjd");
        registerSteps.clickRegister();

        registerSteps.verifyRegisterNotmatchingpasswordsError();








    }
}
