package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutwhenLoggedIN() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();

        searchSteps.navigateToProductName1("beanie");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();

        cartSteps.viewCartDashIcon();
        cartSteps.clickCheckoutButton();
        checkoutSteps.clickplaceOrder();
        checkoutSteps.verifyOrderPlacedSuccessfullyMsg();
    }

        @Test
        public void checkoutwhenNotLoggedINwithoutCreatinganAccount(){
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCartDashIcon();
        cartSteps.clickCheckoutButton();

        checkoutSteps.setcheckoutFirstnameBillingField("Ana Maria");
        checkoutSteps.setcheckoutLastnameBillingField("Oltean");
        checkoutSteps.setcheckoutAddressStreetNoBillingField("Libertatii,10");
        checkoutSteps.setcheckoutApartmentNoBillingField("152 B");
        checkoutSteps.setcheckoutCityBillingField("Cluj-Napoca");
        checkoutSteps.setcheckoutPostcodeBillingField("400534");
        checkoutSteps.setcheckoutPhoneNoBillingField("0756999101");
        checkoutSteps.setcheckoutEmailBillingField("anamariaoltean16@gmail.com");

        checkoutSteps.clickplaceOrder();
        checkoutSteps.verifyOrderPlacedSuccessfullyMsg();



    }
    @Test
    public void checkoutandchoosetocreateanAccount(){
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCartDashIcon();
        cartSteps.clickCheckoutButton();

        checkoutSteps.fillInBillingInformation("ANA","POP","20 Libertatii","24","Cluj-Napoca","400678","0878999000","anapop310@yahoo.com");

        checkoutSteps.selectCreateAccount();
        checkoutSteps.createAccountPassword("anamaria29!");

        checkoutSteps.clickplaceOrder();
        checkoutSteps.verifyOrderPlacedSuccessfullyMsg();
//new information needed
    }



}


