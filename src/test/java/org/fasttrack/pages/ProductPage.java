package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class ProductPage extends BasePage {


    @FindBy(css = "[title='Qty']")
    private WebElementFacade setQtyField;

    @FindBy(css = "[name='add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div.woocommerce-message > a")
    private WebElementFacade viewcarticon;

    @FindBy(css = "i.dashicons.dashicons-cart")
    private WebElementFacade cartDashIcon;

    public void clickADDtoCartButton() {
        clickOn(addToCartButton);

    }

    public void setProductQTyField(String value) {
        clickOn(setQtyField);
        typeInto(setQtyField, value);
    }

    public String viewCartTextDisplayedafterAddingaproduct() {
        return viewcarticon.getText();
    }
    public void clickViewCartButton() {
        clickOn(viewcarticon);

    }
    public void clickCartDashicon() {
        clickOn(cartDashIcon);

    }

}
