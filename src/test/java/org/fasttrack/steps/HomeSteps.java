package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class HomeSteps extends BaseSteps {
    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void isSiteTitleLinkClickable(){
        homePage.isSiteTitleLinkclickable();
    }

    @Step
    public void isHomeLinkClickable() {
        homePage.isHomelinkclickable();
    }

    @Step
    public void isMyAccountLinkClickable() {
        homePage.isMyAccountlinkclickable();
    }

    @Step
    public void isShopLinkClickable() {
        homePage.isShoplinkclickable();
    }

    @Step
    public void isCheckoutLinkClickable() {
        homePage.isCheckoutlinkclickable();
    }

    @Step
    public void isSearchIconClickable() {
        homePage.isSearchIconclickable();
    }
    @Step
    public void isCartIconClickable(){
        homePage.isCartIconclickable();
    }

    @Step
    public void areAddtoCartandReadmoreButtonsClickable(){
        homePage.areAddtoCartandReadmoreButtonsClickable();
    }

    @Step
    public void areWidgetsLinksClickable(){
        homePage.areWidgetLinksClickable();
    }
}