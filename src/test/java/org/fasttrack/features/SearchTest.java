package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void loginAndSearchForProductNameTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.searchForKeyword("necklace");
        searchSteps.findProductWithNameInListAndOpen("SILVER DESERT NECKLACE");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("FRENCH CUFF COTTON TWILL OXFORD");

    }

    @Test //ex 1
    public void SearchForProductNameTest() {
        searchSteps.searchForKeyword("necklace");
        searchSteps.findProductInList("SILVER DESERT NECKLACE");

    }


    @Test //ex 2
    public void SearchForProductNameandSortbyPriceTest() {
        searchSteps.searchForKeyword("shirts");
        searchSteps.sortProductListByPrice();
        searchSteps.checkifFirstpriceisSmallerthanLast();
    }
}
