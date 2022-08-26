package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        cartPage.clickADDtoCartButton();
        }

    @Step
    public void getSuccesMsgProductaddedtoCart(String productName){
        Assert.assertEquals(productName.toLowerCase() + "was added to your shopping cart.",cartPage.getProductAddedSuccesfullytoCartText().toLowerCase());

     //   Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
               // , cartPage.getSuccessMessageSpan().toLowerCase());
}
@Step
    public void clickCheckoutButton(){
        cartPage.clickCheckoutButton();
    }

    @Step
    public void setCartProductQty(String qty){cartPage.setProductQTyField(qty);}
    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }
    @Step
    public void clickUpdateCartQuantityButton(){
        cartPage.clickUpdateQtyCartButton();
    }
    @Step
    public void setandUpdateProductQty(String qty){
        setCartProductQty(qty);
        clickUpdateCartQuantityButton();
    }
    }

