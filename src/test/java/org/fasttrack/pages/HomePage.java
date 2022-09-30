package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends BasePage {
    @FindBy(css=".site-title a")
    private WebElementFacade sitetitlelink;

    @FindBy(css = "#menu-item-63 a")
    private WebElementFacade homelink;

    @FindBy(css = "#menu-item-64 a ")
    private WebElementFacade myaccountLink;

    @FindBy(css = "#menu-item-66 a")
    private WebElementFacade shoplink;

    @FindBy(css = "#menu-item-65 a")
    private WebElementFacade checkoutlink;

    @FindBy(css = " div.search-box > i")
    private WebElementFacade searchIcon;

    @FindBy(css=".icon-search:last-child")
    private WebElementFacade searchicon2;

    @FindBy(css="[name='s']")
    private WebElementFacade searchField;

    @FindBy(className = "cart-control")
    private WebElementFacade carticon;

    @FindBy(css = ".add-cart")
    private List<WebElementFacade> addtocartReadmoreButtonsList;

    @FindBy(css="h3.widget-title ")
    private List<WebElementFacade> widgetlinksList;


    public void clickAccountLink() {
        clickOn(myaccountLink);
    }


    public boolean isSiteTitleLinkclickable() {
        sitetitlelink.isClickable();
        return true;

    }
    public boolean isHomelinkclickable() {
        homelink.isClickable();
        return true;
    }

    public boolean isMyAccountlinkclickable() {
        myaccountLink.isClickable();
        return true;
    }

    public boolean isShoplinkclickable() {
        shoplink.isClickable();
        return true;
    }

    public boolean isCheckoutlinkclickable() {
        checkoutlink.isClickable();
        return true;
    }

    public boolean isSearchIconclickable() {
        searchIcon.isClickable();
        return true;
    }

    public boolean isCartIconclickable() {
        carticon.isClickable();
        return true;

    }

    public boolean areAddtoCartandReadmoreButtonsClickable() {
        for (WebElementFacade element : addtocartReadmoreButtonsList) {
            if (element.isClickable()) ;
            return true;
        }
        return false;
    }
    public boolean areWidgetLinksClickable() {
        for (WebElementFacade element1 : widgetlinksList) {
            if (element1.isClickable()) ;
            return true;
        }
        return false;
    }
   public void clickSearchButton(){
       clickOn(searchIcon);
   }

    public void setSearchField(String value){
        typeInto(searchField,value);
        searchicon2.click();
    }

}