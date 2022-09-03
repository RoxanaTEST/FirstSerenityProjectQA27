package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".category-products .item .product-name a")
    private List<WebElementFacade> listOfProductNames;

    @FindBy(css = ".item.last:not(.item.last.odd)")
    private List<WebElementFacade> getListOfProductNames;


    @FindBy(css = ".product-name:not(p)")
    private List<WebElementFacade> getproductnametitle;


    @FindBy(css = ".sort-by > select")
    private WebElementFacade sortBybutton;

    @FindBy(css = " div.category-products >div.toolbar > div.sorter > div > select > option:nth-child(3)")
    private WebElementFacade sortByPrice;


    @FindBy(id = "product-price-403")
    private WebElementFacade smallestpricefromthelist;


    @FindBy(id = "product-price-402")
    private WebElementFacade biggestpricefromthelist;

    @FindBy(css = ".price:not(#old-price-403)")
    private List<WebElementFacade> allproductsPriceList;


    public boolean findProductInGridAndOpen(String productName) {
        for (WebElementFacade element : listOfProductNames) {
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                return true;
            }
        }
        return false;
    }

    public boolean findProductInGrid(String productname) {
        for (WebElementFacade element : getListOfProductNames)
            for (WebElementFacade element2 : getproductnametitle) {
                if (element2.getText().equalsIgnoreCase(productname)) {
                    return true;
                }
            }
        return false;
    }

    public void selectSortbyPriceOption() {
        clickOn(sortBybutton);
        clickOn(sortByPrice);
    }


    public boolean checktheSmallerPriceisDisplayedfirst() {
        for (WebElementFacade elementFacade : allproductsPriceList) {
            int small = convertStringToInteger(smallestpricefromthelist.getText());
            int big = convertStringToInteger(biggestpricefromthelist.getText());
            if (small < big) {
                return true;
            }

        }
        return false;
    }
}