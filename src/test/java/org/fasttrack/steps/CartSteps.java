package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickADDtoCartButton();
        }

        @Step
        public void getSuccesMsgProductaddedtoCart(String productName){
            Assert.assertEquals((productName + " was added to your shopping cart.").toLowerCase(), cartPage.getProductAddedSuccesfullytoCartText().toLowerCase());
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
    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }

    @Step
    public void checkIfTotalPriceiscorrect(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches2());
    }
}


