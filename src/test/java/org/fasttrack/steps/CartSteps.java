package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void setCartProductQty(String qty) {
        productPage.setProductQTyField(qty);
    }

    @Step
    public void addProductToCart() {
        productPage.clickADDtoCartButton();
    }

    @Step
    public void viewCartTextDisplayedafterAddingaproductintheCart() {
        Assert.assertEquals("View cart", productPage.viewCartTextDisplayedafterAddingaproduct());
    }

    @Step
    public void viewCart() {
        productPage.clickViewCartButton();
    }
    @Step
    public void viewCartDashIcon() {
        productPage.clickCartDashicon();
    }
    @Step
    public void viewCartsCheckoutButtonafterAccessingyourCart() {
        Assert.assertEquals("Proceed to checkout", cartPage.viewCheckoutTextDisplayed());
    }

    @Step
    public void setandUpdateCartsQuantity(String Qty) {
        cartPage.setCartsQTyField(Qty);

    }

    @Step
    public void verifyCartUpdatedSuccessfullyMessage() {
        Assert.assertEquals("Cart updated.", cartPage.getUpdateCartSuccessfullyMessage());
    }

    @Step
    public void applyDiscountCoupon(String discountCode) {
        cartPage.typeinCouponCodeandSubmit(discountCode);
    }


    @Step
    public void verifyDiscountAppliedSuccessfullyMessageDisplayed() {
        Assert.assertEquals("Coupon code applied successfully.", cartPage.viewDiscountAppliedSuccessfullyTextDisplayed());

    }

    @Step
    public void verifyDiscountNotAppliedErrorMessageDisplayed() {
        Assert.assertEquals("Coupon code already applied!", cartPage.viewDiscountAppliedSuccessfullyTextDisplayed());

    }

    @Step
    public void emptyCart() {
        cartPage.emptyCartButton();
    }

    @Step
    public void verifyCartEmptiedMessageDisplayed() {
        Assert.assertEquals("Your cart is currently empty.", cartPage.getMessageCartSuccessfullyEmptiedMessage());

    }

    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }


    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }

    @Step
    public void clickCheckoutButton(){
        cartPage.doCheckout();
    }
}




