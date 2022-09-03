package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("Silver desert necklace ");

    }

    @Test
    public void checkTotalAndSubtotalTest() {
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("SILVER DESERT NECKLACE");

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }

    @Test //ex3
    public void checkTotalpriceTest() {
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("SWING TIME EARRINGS");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("SWING TIME EARRINGS");

        searchSteps.navigateToProductName("ISLA CROSSBODY HANDBAG");
        cartSteps.addProductToCart();
        cartSteps.getSuccesMsgProductaddedtoCart("ISLA CROSSBODY HANDBAG");


         cartSteps.checkIfTotalPriceiscorrect();

    }
}
