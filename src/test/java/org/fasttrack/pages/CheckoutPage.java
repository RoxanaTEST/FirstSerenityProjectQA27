package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy ( id = "place_order")
    private WebElementFacade placeorderButton;

    @FindBy( css = "p.woocommerce-notice")
    private WebElementFacade orderConfirmationMessage;


    public void clickPlaceOrder(){
        clickOn(placeorderButton);
        waitABit(3000);
    }

    public String verifyOrderplacedSuccessfullyMessage() {
        return orderConfirmationMessage.getText();
    }

}





