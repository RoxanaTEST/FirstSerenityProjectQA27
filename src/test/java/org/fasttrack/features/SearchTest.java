package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void SearchForProductNameTest() {
        searchSteps.clickOnSearchIcon();
        searchSteps.searchForKeyword("beanie");
        searchSteps.findProductWithNameInListAndOpen("beanie with logo");

    }
    @Test
    public void searchforaSecondproductbyNameTest(){
        searchSteps.clickOnSearchIcon();
        searchSteps.navigateToProductName("sunglasses");

    }

    @Test
    public void loginAndSearchForProductNameTest() {
        loginSteps.doLogin(Constants.userEmail, Constants.userPass);
        searchSteps.clickOnSearchIcon();
        searchSteps.searchForKeyword("beanie");
        searchSteps.findProductWithNameInListAndOpen("beanie with logo");
    }


}
