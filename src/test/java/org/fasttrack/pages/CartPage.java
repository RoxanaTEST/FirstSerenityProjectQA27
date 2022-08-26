package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class CartPage extends PageObject {
    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessageSpan;

    @FindBy(css = ".add-to-cart-buttons span span ")
    private WebElementFacade addToCartButton;

    @FindBy(css = "ul.checkout-types.top")
    private WebElementFacade checkoutButton;

    @FindBy(css = "[title='Qty']")
    private WebElementFacade selectProductQtyField;

    @FindBy(css = "[title='Update']")
    private WebElementFacade updateProductQtyButton;

    public String getProductAddedSuccesfullytoCartText() {
        return successMessageSpan.getText();
    }

        public void clickADDtoCartButton(){
            clickOn(addToCartButton);

    }
    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }

    public void setProductQTyField(String value) {
        typeInto(selectProductQtyField, value);
    }

    public void clickUpdateQtyCartButton(){
        clickOn(updateProductQtyButton);
    }
    }


