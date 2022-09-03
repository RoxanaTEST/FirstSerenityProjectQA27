package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id ="firstname")
    private WebElementFacade registerfirstname;

    @FindBy(id ="middlename")
    private WebElementFacade registermiddlename;

    @FindBy(id ="lastname")
    private WebElementFacade registerlastname;

    @FindBy(id ="email_address")
    private WebElementFacade registeremailaddress;

    @FindBy(id ="password")
    private WebElementFacade registerpassword;

    @FindBy(id ="confirmation")
    private WebElementFacade registerpassconfirmation;

    @FindBy(css = "#is_subscribed")
    private WebElementFacade registersubscription;

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade registerButton;

    @FindBy(css = ".error-msg span")
    private WebElementFacade alreadyregisteredmsg;

    @FindBy(css = ".validation-advice")
    private WebElementFacade passwordsnoNotmatch;

    @FindBy(css = ".success-msg span")
    private WebElementFacade registrationsuccesmessage;




    public void setRegisterfirstname(String firstname){

    typeInto(registerfirstname,firstname);
    }

    public void setRegisterMiddlename(String middlename){

    typeInto(registermiddlename,middlename);
    }

    public void setRegisterLastname(String lastname){

    typeInto(registerlastname,lastname);
    }

    public void setRegisterEmailAddress(String email){

    typeInto(registeremailaddress,email);
    }

    public void setRegisterPassword(String password){

    typeInto(registerpassword,password);
    }

    public void setRegisterPasswordReconfirm(String confirmpassword){
       typeInto(registerpassconfirmation,confirmpassword);
    }

    public void clickRegisterSubscribtionButton() {
        clickOn(registersubscription);
    }
        public void clickRegisterButton() {
            clickOn(registerButton);
    }


    public String getAlreadyregisterederror(){
        return alreadyregisteredmsg.getText();}



    public boolean getPasswordnotMatchingError(){
        passwordsnoNotmatch.isDisplayed();
        return true;
    }
    public String getSuccessfullyRegisteredmessage(){
        return registrationsuccesmessage.getText();
    }
}


