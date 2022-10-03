package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy ( id = "place_order")
    private WebElementFacade placeorderButton;

    @FindBy( css = "p.woocommerce-notice")
    private WebElementFacade orderConfirmationMessage;

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNamecheckoutField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNamecheckoutField;

    @FindBy(css = "[name='billing_address_1']")
    private WebElementFacade streetnameNocheckoutField;

    @FindBy(css = "[name='billing_address_2']")
    private WebElementFacade apartmentNocheckoutField;

    @FindBy(css = "[name='billing_city']")
    private WebElementFacade citycheckoutField;

    @FindBy(css = "[name='billing_postcode']")
    private WebElementFacade postcodecheckoutField;

    @FindBy(css = "[name='billing_phone']")
    private WebElementFacade phonecheckoutField;

    @FindBy(css = "[name='billing_email']")
    private WebElementFacade emailcheckoutField;

    @FindBy(id = "createaccount")
    private WebElementFacade createaccountradiobutton;

    @FindBy(id = "account_password")
    private WebElementFacade createaccountpassword;




    public void clickPlaceOrder(){
        clickOn(placeorderButton);
        waitABit(3000);
    }

    public String verifyOrderplacedSuccessfullyMessage() {
        return orderConfirmationMessage.getText();
    }

    public void setFirstNamecheckoutField(String firstname) {
        typeInto(firstNamecheckoutField, firstname);
    }

    public void setLastNamecheckoutField(String lastname) {
        typeInto(lastNamecheckoutField,lastname);
    }

    public void setStreetnameNocheckoutField(String address) {
        typeInto(streetnameNocheckoutField,address);
    }

    public void setapartmentNocheckoutField(String apNOaddress) {
        typeInto(apartmentNocheckoutField,apNOaddress);
    }

    public void setCityNocheckoutField(String city) {
        typeInto(citycheckoutField,city);
    }

    public void setZipcodecheckoutField(String zipcode) {
        typeInto(postcodecheckoutField,zipcode);
    }
    public void setPhoneNocheckoutField(String phoneno) {
        typeInto(phonecheckoutField,phoneno);
    }

    public void setEmailcheckoutField(String email) {
        typeInto(emailcheckoutField,email);
    }

    public void selectCreateAcoount(){
       clickOn(createaccountradiobutton);
    }

    public void createAccountPassword(String accountpassword){
        typeInto(createaccountpassword,accountpassword);
    }
}





