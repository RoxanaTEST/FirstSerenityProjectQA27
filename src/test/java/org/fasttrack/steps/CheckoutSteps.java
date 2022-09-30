package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
 @Step
    public void clickplaceOrder(){
     checkoutPage.clickPlaceOrder();
 }
 @Step
    public void verifyOrderPlacedSuccessfullyMsg() {
        Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.verifyOrderplacedSuccessfullyMessage());
    }
}




