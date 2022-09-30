package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomeAccountPage extends BasePage {

    @FindBy(id = "reg_email")
    private WebElementFacade registeremailfield;

    @FindBy(id = "reg_password")
    private WebElementFacade registerpasswordfield;


    @FindBy(css = "[name = 'register']")
    private WebElementFacade registerLink;

    @FindBy(css="#username")
    private WebElementFacade loginEmailField;

    @FindBy(css="#password")
    private WebElementFacade loginPasswordField;

    @FindBy(css = "[name='login")
    private WebElementFacade loginLink;



    @FindBy(css = "[role='alert'] li")
    private WebElementFacade alreadyregisteredErrorText;

    @FindBy(css = "[role='alert'] li")
    private WebElementFacade incorectEmailErrorText;

    @FindBy(css = " #reg_email,::after")
    private WebElementFacade formatnotvalidEmailaddress;

    @FindBy(css = "h2.entry-title ")
    private WebElementFacade myaccountdisplayText;

    @FindBy(css = "#customer_login .u-column2 h2")
    private WebElementFacade registertextdisplayed;

    @FindBy(css="[role='alert'] li")
    private WebElementFacade invalidPassworderrorLogin;

    @FindBy(css="[role='alert'] li")
    private WebElementFacade invalidEmailErrorLogin;

    @FindBy(css="[role='alert'] li")
    private WebElementFacade mandatoryUsernamefieldErrorLogin;

    @FindBy(css="[role='alert'] li")
    private WebElementFacade mandatoryPasswordfieldErrorLogin;






    public void setRegisterEmailField(String value) {
        typeInto(registeremailfield, value);
    }

    public void setRegisterPasswordField(String value) {
        typeInto(registerpasswordfield, value);
    }

    public void clickRegisterLink() {
        clickOn(registerLink);
    }


    public String getAlreadyregisterederror() {
        return alreadyregisteredErrorText.getText();
    }

    public String getInvalidEmailregisterError() {
        return incorectEmailErrorText.getText();
    }

    public String getInvalidFormatEmailregistererror() {
        return formatnotvalidEmailaddress.getText();
    }

    public String displayRegistertext() {
      return  registertextdisplayed.getText();

    }

    public void setLoginEmailField(String value) {
        typeInto(loginEmailField, value);
    }



    public void setLoginPasswordField(String value) {
        typeInto(loginPasswordField, value);
    }


    public void clickLoginLink() {
        clickOn(loginLink);
    }


    public String getInvaliPasswordLoginError() {
        return invalidPassworderrorLogin.getText();
    }

    public String getInvalidEmailLoginError() {
        return invalidEmailErrorLogin.getText();
    }

    public String getInvalidUsernameLoginError() {
        return mandatoryUsernamefieldErrorLogin.getText();
    }

    public String getInvalidPasswordLoginError() {
        return mandatoryPasswordfieldErrorLogin.getText();
    }
}

