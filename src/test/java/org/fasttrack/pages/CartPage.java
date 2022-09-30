package org.fasttrack.pages;

import io.cucumber.java.ja.前提;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;

public class CartPage extends BasePage {
    @FindBy(css = ".checkout-button")
    private WebElementFacade cartcheckoutbutton;

    @FindBy(css = "[title='Qty']")
    private WebElementFacade modifyproductsQty;

    @FindBy(css = "[name='update_cart']")
    private WebElementFacade updateCartButton;

    @FindBy(css = "[role='alert']")
    private WebElementFacade updatecartSuccessMessage;

    @FindBy(id = "coupon_code")
    private WebElementFacade couponField;

    @FindBy(css = "[value='Apply coupon']")
    private WebElementFacade applyCouponButton;

    @FindBy(css = "[role='alert']")
    private WebElementFacade discountCodeAppliedSuccessfullyMessage;

    @FindBy(css = ".product-remove [aria-label='Remove this item'] ")
    private WebElementFacade removeItemButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade cartemptyconfirmationMessage;

    @FindBy(css = " td.product-subtotal")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount")
    private WebElementFacade subtotalCartPrice;


    @FindBy(css = ".shipping .woocommerce-Price-amount")
    private WebElementFacade shippingfee;

    @FindBy(css=".order-total .woocommerce-Price-amount")
    private WebElementFacade totalCartPrice;

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;


    public String viewCheckoutTextDisplayed() {
        return cartcheckoutbutton.getText();
    }

    public void updateCartButton() {
        clickOn(updateCartButton);
    }

    public void setCartsQTyField(String value) {
        clickOn(modifyproductsQty);
        typeInto(modifyproductsQty, value);
        clickOn(updateCartButton);

    }
    public String getUpdateCartSuccessfullyMessage(){
       return updatecartSuccessMessage.getText();

    }
    public void typeinCouponCodeandSubmit(String value) {
        clickOn(couponField);
        typeInto(couponField, value);
        clickOn(applyCouponButton);

    }
    public String viewDiscountAppliedSuccessfullyTextDisplayed() {
        return discountCodeAppliedSuccessfullyMessage.getText();
    }

    public void emptyCartButton() {
        clickOn(removeItemButton);
    }

    public String getMessageCartSuccessfullyEmptiedMessage(){
        return cartemptyconfirmationMessage.getText();

    }

    public int getProductsSubtotal() {
        int sum = 0;
        for (WebElementFacade elementFacade:subtotalProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;

    }

    public boolean checkIfSubtotalMatches() {
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }

    public boolean checkIfTotalPriceMatches() {
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(shippingfee.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
    public void doCheckout(){
        clickOn(checkoutButton);
    }

}






