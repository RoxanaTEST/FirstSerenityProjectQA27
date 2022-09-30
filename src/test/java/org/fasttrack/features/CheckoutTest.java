package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutwhenLoggedIN() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();

        searchSteps.navigateToProductName("beanie");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();

        cartSteps.viewCartDashIcon();
        cartSteps.clickCheckoutButton();
        checkoutSteps.clickplaceOrder();
        checkoutSteps.verifyOrderPlacedSuccessfullyMsg();


    }
}


