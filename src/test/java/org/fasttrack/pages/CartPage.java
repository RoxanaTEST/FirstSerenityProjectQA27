package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;

public class CartPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessageSpan;


    @FindBy(css = "ul.checkout-types.top")
    private WebElementFacade checkoutButton;

    @FindBy(css = "[title='Qty']")
    private WebElementFacade selectProductQtyField;

    @FindBy(css = "[title='Update']")
    private WebElementFacade updateProductQtyButton;

    @FindBy(css = ".product-cart-total")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".product-cart-price")
    private List<WebElementFacade> PriceProductsList;


    @FindBy(css = "tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;


    public String getProductAddedSuccesfullytoCartText() {
        return successMessageSpan.getText();
    }


    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void setProductQTyField(String value) {
        typeInto(selectProductQtyField, value);
    }

    public void clickUpdateQtyCartButton() {
        clickOn(updateProductQtyButton);
    }

    public int getProductsSubtotal() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductsList) {
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
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

    public int getProductsPriceTotal() {
        int sum = 0;
        for (WebElementFacade elementFacade : PriceProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }

    public boolean checkIfTotalPriceMatches2() {
        int itemspricetotal = getProductsPriceTotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = itemspricetotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

}






