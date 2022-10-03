package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
 @Step
    public void clickplaceOrder(){
     checkoutPage.clickPlaceOrder();
 }
 @Step
    public void verifyOrderPlacedSuccessfullyMsg() {
        Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.verifyOrderplacedSuccessfullyMessage());
    }

    @Step
    public void setcheckoutFirstnameBillingField(String firstname) {
        checkoutPage.setFirstNamecheckoutField(firstname);
    }

    @Step
    public void setcheckoutLastnameBillingField(String lastname) {
        checkoutPage.setLastNamecheckoutField(lastname);
    }
    @Step
    public void setcheckoutAddressStreetNoBillingField(String address) {
        checkoutPage.setStreetnameNocheckoutField(address);
    }

    @Step
    public void setcheckoutApartmentNoBillingField(String apNOaddress) {
        checkoutPage.setapartmentNocheckoutField(apNOaddress);
    }

    @Step
    public void setcheckoutCityBillingField(String city) {
        checkoutPage.setCityNocheckoutField(city);
    }

    @Step
    public void setcheckoutPostcodeBillingField(String zipcode) {
        checkoutPage.setZipcodecheckoutField(zipcode);
    }
    @Step
    public void setcheckoutPhoneNoBillingField(String phoneno) {
        checkoutPage.setPhoneNocheckoutField(phoneno);
    }

    @Step
    public void setcheckoutEmailBillingField(String email) {
        checkoutPage.setEmailcheckoutField(email);
    }

    @Step
    public void selectCreateAccount() {
        checkoutPage.selectCreateAcoount();
    }

    @Step
    public void createAccountPassword(String accountpassword){
        checkoutPage.createAccountPassword(accountpassword);
    }
    @Step
    public void fillInBillingInformation(String firstname,String lastname,String address,String apNOaddress,String city,String zipcode,String phoneno,String email){
      setcheckoutFirstnameBillingField(firstname);
      setcheckoutLastnameBillingField(lastname);
      setcheckoutAddressStreetNoBillingField(address);
      setcheckoutApartmentNoBillingField(apNOaddress);
      setcheckoutCityBillingField(city);
      setcheckoutPostcodeBillingField(zipcode);
      setcheckoutPhoneNoBillingField(phoneno);
      setcheckoutEmailBillingField(email);


    }
}




