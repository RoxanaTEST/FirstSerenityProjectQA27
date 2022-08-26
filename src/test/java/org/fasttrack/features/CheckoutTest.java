package org.fasttrack.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutwithAlreadySavedShippingInformationTest(){
        loginSteps.doLogin(userEmail,userPass);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.setandUpdateProductQty("1");
        cartSteps.clickCheckoutButton();
        checkoutSteps.clickShiptothisAddress();
        checkoutSteps.clickContinuetoshippingInformation();
        checkoutSteps.selectFreeShippingRadioButton();
        checkoutSteps.selectContinuetoPaymentButton();
        checkoutSteps.acceptCashpaymentCheckout();
        checkoutSteps.selectPlaceOrderCheckoutButton();
        checkoutSteps.verifyOrderConfirmationMsg();

    }

    @Test
    public void validCheckoutfirstOrderTest(){
        loginSteps.doLogin("anamaria.po@gmail.com","1234567");
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.setandUpdateProductQty("1");
        cartSteps.clickCheckoutButton();
        checkoutSteps.setcheckoutAddressBillingField("str Azaleelor,nr 25");
        checkoutSteps.setcheckoutCityBillingField("Cluj-Napoca");
        checkoutSteps.selectcheckoutCountryBillingDroppdownField("Romania");
        checkoutSteps.selectcheckoutStateBillingDroppdownField("Cluj");
        checkoutSteps.setZipcodeBillingCheckout("653783");
        checkoutSteps.setPhoneNoBillingCheckout("0766999666");
        checkoutSteps.clickContinuetoshippingInformation();
        checkoutSteps.selectFreeShippingRadioButton();
        checkoutSteps.selectContinuetoPaymentButton();
        checkoutSteps.acceptCashpaymentCheckout();
        checkoutSteps.selectPlaceOrderCheckoutButton();
        checkoutSteps.verifyOrderConfirmationMsg();

    }


    }

