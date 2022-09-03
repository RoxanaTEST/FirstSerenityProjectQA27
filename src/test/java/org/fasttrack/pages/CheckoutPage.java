package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(css = "[title='Ship to this address")
    private WebElementFacade shiptothissavedaddressRadioButton;
    //billing information
    @FindBy(css = "[title='First Name']")
    private WebElementFacade firstNamecheckoutBillingField;

    @FindBy(css = "[title='Middle Name/Initial']")
    private WebElementFacade middleNamecheckoutBillingField;

    @FindBy(css = "[title='Last Name']")
    private WebElementFacade lastNamecheckoutBillingField;

    @FindBy(css = "#billing\\:street1")
    private WebElementFacade addresscheckoutBillingField;


    @FindBy(css = "[title='City']")
    private WebElementFacade citycheckoutBillingField;

    @FindBy(css = "#billing\\:country_id")
    private WebElementFacade countrycheckoutBillingField;

    @FindBy(css = "#billing\\:region_id")
    private WebElementFacade statecheckoutBillingField;

    @FindBy(css = "[title='Zip/Postal Code']")
    private WebElementFacade zipcodeCheckoutBillingField;

    @FindBy(css = "[title='Telephone']")
    private WebElementFacade telephoneNocheckoutBillingField;

    @FindBy(css = "[title='Ship to different address']")
    private WebElementFacade shiptodifferentaddressbutton;

//Shipping Information

    @FindBy(css = "[name='shipping[firstname]']")
    private WebElementFacade firstNamecheckoutShippingField;

    @FindBy(css = "[name='shipping[middlename]']")
    private WebElementFacade middleNamecheckoutShippingField;

    @FindBy(css = "[name='shipping[lastname]']")
    private WebElementFacade lastNamecheckoutShippingField;

    @FindBy(css = "[name='shipping[street][]']")
    private WebElementFacade addresscheckoutShippingField;


    @FindBy(css = "[name='shipping[city]']")
    private WebElementFacade citycheckoutShippingField;

    @FindBy(css = "[name='shipping[country_id]']")
    private WebElementFacade countrycheckoutShippingField;

    @FindBy(css = "[name='shipping[region_id]']")
    private WebElementFacade statecheckoutShippingField;

    @FindBy(css = "[name='shipping[postcode]']")
    private WebElementFacade zipcodeCheckoutShippingField;

    @FindBy(css = "[name='shipping[telephone]']")
    private WebElementFacade telephoneNocheckoutShippingField;

    @FindBy(css = " #shipping-buttons-container > button > span > span")
    private WebElementFacade continuetoshippingmethodbutton;


    @FindBy(css = "[title='Continue']")
    private WebElementFacade continueCheckoutbillingbutton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeshippingCheckoutradiobutton;

    @FindBy(css = "[onclick='shippingMethod.save()")
    private WebElementFacade checkoutshippingbutton;

    @FindBy(css = "[onclick='payment.save()")
    private WebElementFacade cashpaymentcheckoutbutton;

    @FindBy(css = "[onclick='review.save();']")
    private WebElementFacade placeorderbutton;

    @FindBy(css = ".sub-title ")
    private WebElementFacade orderconfirmationsuccessmsg;





    public void setAddresscheckoutBillingField(String address) {
        typeInto(addresscheckoutBillingField, address);
    }

    public void setCheckoutfirstnamebilling(String firstname) {
        typeInto(firstNamecheckoutBillingField, firstname);
    }


    public void setCheckoutmiddlenamebilling(String middlename) {
        typeInto(middleNamecheckoutBillingField, middlename);
    }


    public void setCheckoutlastnamebilling(String lastname) {

        typeInto(lastNamecheckoutBillingField, lastname);
    }

    public void clickShiptothisAddress() {
        clickOn(shiptothissavedaddressRadioButton);
    }

    public void selectCheckoutbillingButton() {
        clickOn(continueCheckoutbillingbutton);
    }

    public void setCheckoutcity(String city) {
        typeInto(citycheckoutBillingField, city);
    }

    public void selectCheckoutCountry() {
        countrycheckoutBillingField.click();
    }

    public void typeinChechoutCountry(String country) {
        countrycheckoutBillingField.sendKeys(country);
    }

    public void clickSelectedCountry() {
        countrycheckoutBillingField.click();
    }




    public void selectCheckoutState() {
        statecheckoutBillingField.click();
    }

    public void typeinChechoutState(String country) {
        statecheckoutBillingField.sendKeys(country);
    }

    public void clickSelectedstate() {
        statecheckoutBillingField.click();
    }


    public void setCheckoutZipcodebilling(String zipcode) {
        typeInto(zipcodeCheckoutBillingField, zipcode);
    }


    public void setPhoneNumberCheckoutbilling(String number) {
        typeInto(telephoneNocheckoutBillingField, number);
    }



        public void selectFreeShippingRadiobutton () {
            clickOn(freeshippingCheckoutradiobutton);
        }

        public void clickoncontinuetoPaymentCheckoutButton () {
            clickOn(checkoutshippingbutton);
        }
        public void acceptCashondeliverypaymentmethod () {
            clickOn(cashpaymentcheckoutbutton);
        }

        public void clickOnPlaceOrderCheckoutButton () {
            clickOn(placeorderbutton);
        }


        public String getOrderConfirmationSuccessMsg () {
            return orderconfirmationsuccessmsg.getText();
        }

    }






//  public void setCheckoutTelephoneNobilling(String number) {
        //      telephoneNocheckout.clear();
        //     telephoneNocheckout.sendKeys(number);
        // }

        //  public void clickCheckoutataDifferentAdsress() {
        //     shiptodifferentaddressbutton.click();

        // }


        // public void clickShippingAddressCheckout() {
        //    addresscheckout2.click();
        //}

        //public void setShippingcheckoutaddress(String address) {
        //    addresscheckout2.clear();
        //    addresscheckout2.sendKeys(address);
        // }

        //  public void clickShippingCityCheckoutfield() {
        //     citycheckout2.click();
        // }

        // public void setShippingCheckoutcity(String city) {
        //    citycheckout2.clear();
        //   citycheckout2.sendKeys(city);
        //}


        //  public void selectShippingCheckoutCountry() {
        //     countrycheckout2.click();
        // }

        //  public void typeinShippingChechoutCountry(String country) {
        //   countrycheckout2.sendKeys(country);
        // }

        //  public void clickShippingSelectedCountry() {
        //    countrycheckout2.click();
        // }

        // public void selectShippingCheckoutstate() {
        //    statecheckout2.click();
        // }

        //  public void typeinShippingCheckoutState(String state) {
        //     statecheckout2.sendKeys(state);
        // }

        // public void clickShippingSelectedState() {
        //    statecheckout2.click();
        //  }

        // public void setShippingCheckoutZipcode(String zipcode) {
        //    zipcodeCheckout2.clear();
        //   zipcodeCheckout2.sendKeys(zipcode);

        // }

        // public void setShippingCheckoutTelephoneNo(String number) {
        //    telephoneNocheckout2.clear();
        //   telephoneNocheckout2.sendKeys(number);
        //}

        // public void clickonShippingMethodCheckout() {
        //    clickOn(continuetoshippingmethodbutton);
        // }





