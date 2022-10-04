package org.fasttrack.features;

import io.cucumber.java.ja.前提;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCartTextDisplayedafterAddingaproductintheCart();

    }

    @Test
    public void AddProductToCartNOloginTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("2");
        cartSteps.addProductToCart();
        cartSteps.viewCartTextDisplayedafterAddingaproductintheCart();

    }

    @Test
    public void accessYourCartTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("2");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.viewCartsCheckoutButtonafterAccessingyourCart();
    }

    @Test
    public void updateProductsQtyinyourCartTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("2");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.setandUpdateCartsQuantity("1");
        cartSteps.verifyCartUpdatedSuccessfullyMessage();

    }

    @Test
    public void useDiscountCouponTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.setandUpdateCartsQuantity("1");
        cartSteps.applyDiscountCoupon("50%OFF");
        cartSteps.verifyDiscountAppliedSuccessfullyMessageDisplayed();

    }

    @Test
    public void loginandUseDiscountCouponFortheSecondTimeTest() {
        loginSteps.doLogin(Constants.userEmail,Constants.userPass);
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.setandUpdateCartsQuantity("1");
        cartSteps.applyDiscountCoupon("50%OFF");
        cartSteps.verifyDiscountNotAppliedErrorMessageDisplayed();
    }

    @Test
    public void removeProductsfromCartTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("3");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.emptyCart();
        cartSteps.verifyCartEmptiedMessageDisplayed();


    }
    @Test
    public void loginandRemoveProductfromCartTest() {
        loginSteps.doLogin(Constants.userEmail,Constants.userPass);
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.emptyCart();
        cartSteps.verifyCartEmptiedMessageDisplayed();

    }
    @Test
    public void checkifTotalpriceEqualstheSubtotalandtheFeeTest() {
        searchSteps.navigateToProductName1("hoodie with zipper");
        cartSteps.setCartProductQty("1");
        cartSteps.addProductToCart();

        searchSteps.navigateToProductName1("beanie");
        cartSteps.setCartProductQty("2");
        cartSteps.addProductToCart();

        cartSteps.viewCartDashIcon();
        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();






    }
}
