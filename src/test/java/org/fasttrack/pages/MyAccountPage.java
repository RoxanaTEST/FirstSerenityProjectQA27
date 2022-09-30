package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends BasePage {
    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade registrationsuccesmessage;

    public String getWelcomeText() {
        return registrationsuccesmessage.getText();
    }
}

