package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(css = ".add-to-cart-buttons span span ")
    private WebElementFacade addToCartButton;

    public void clickADDtoCartButton(){
        clickOn(addToCartButton);

    }
}
