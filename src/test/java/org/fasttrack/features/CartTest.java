package org.fasttrack.features;

import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(userEmail,userPass);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("Silver desert necklace ");




    }
}
