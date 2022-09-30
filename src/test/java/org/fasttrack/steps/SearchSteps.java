package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void clickOnSearchIcon() {
        homePage.clickSearchButton();
    }

    @Step
    public void searchForKeyword(String keyword) {
        homePage.setSearchField(keyword);

    }
    @Step
    public void findProductWithNameInListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGridAndOpen(productName));
    }

    @Step
    public void navigateToProductName(String productName){
        clickOnSearchIcon();
        searchForKeyword(productName);
        findProductWithNameInListAndOpen(productName);
    }
}