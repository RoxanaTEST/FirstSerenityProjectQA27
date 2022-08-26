package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void clickShiptothisAddress() {
        checkoutPage.clickShiptothisAddress();

    }

    @Step
    public void clickContinuetoshippingInformation() {
        checkoutPage.selectCheckoutbillingButton();
    }

    @Step
    public void selectFreeShippingRadioButton() {
        checkoutPage.selectFreeShippingRadiobutton();
    }

    @Step
    public void selectContinuetoPaymentButton() {
        checkoutPage.clickoncontinuetoPaymentCheckoutButton();
    }

    @Step
    public void acceptCashpaymentCheckout() {
        checkoutPage.acceptCashondeliverypaymentmethod();
    }

    @Step
    public void selectPlaceOrderCheckoutButton() {
        checkoutPage.clickOnPlaceOrderCheckoutButton();
    }

    @Step
    public void verifyOrderConfirmationMsg() {
        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!", checkoutPage.getOrderConfirmationSuccessMsg());
    }

    @Step
    public void setcheckoutAddressBillingField(String address) {
        checkoutPage.setAddresscheckoutBillingField(address);
    }

    @Step
    public void setcheckoutCityBillingField(String city) {
        checkoutPage.setCheckoutcity(city);
    }

    @Step
    public void selectcheckoutCountryBillingDroppdownField(String country) {
        checkoutPage.selectCheckoutCountry();
        checkoutPage.typeinChechoutCountry(country);
        checkoutPage.clickSelectedCountry();
    }

    @Step
    public void selectcheckoutStateBillingDroppdownField(String state) {
        checkoutPage.selectCheckoutState();
        checkoutPage.typeinChechoutState(state);
        checkoutPage.clickSelectedstate();

    }
    @Step
    public void setZipcodeBillingCheckout(String zipcode){
        checkoutPage.setCheckoutZipcodebilling(zipcode);
    }

    @Step
    public void setPhoneNoBillingCheckout(String number){
        checkoutPage.setPhoneNumberCheckoutbilling(number);
    }
}




