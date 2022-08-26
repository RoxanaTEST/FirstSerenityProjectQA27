package org.fasttrack.features;


import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void loginAndSearchForProductNameTest(){
        loginSteps.doLogin(userEmail,userPass);
        searchSteps.searchForKeyword("necklace");
        searchSteps.findProductWithNameInListAndOpen("SILVER DESERT NECKLACE");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest(){
        loginSteps.doLogin(userEmail,userPass);
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("FRENCH CUFF COTTON TWILL OXFORD");

    }
}
