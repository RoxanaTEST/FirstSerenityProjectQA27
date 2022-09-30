package org.fasttrack.features;

import org.junit.Test;

public class HomeTest extends BaseTest{
    @Test
    public void isSiteTitleLinkClickable(){homeSteps.isSiteTitleLinkClickable();}

    @Test
    public void isHomeLinkClickable(){
        homeSteps.isHomeLinkClickable();
    }

    @Test
    public void isMyaccountLinkClickable(){homeSteps.isMyAccountLinkClickable();}

    @Test
    public void isShopLinkClickable(){homeSteps.isShopLinkClickable();}

    @Test
    public void isCheckoutLinkClickable(){homeSteps.isCheckoutLinkClickable();}

    @Test
    public void isSearchIconClickable(){homeSteps.isSearchIconClickable();}

    @Test
    public void isCartIconClickable(){homeSteps.isCartIconClickable();}

    @Test
    public void areAddtoCartandReadmoreButtonsClickable(){homeSteps.areAddtoCartandReadmoreButtonsClickable();}

    @Test
    public void areWidgetsLinksClickable(){homeSteps.areWidgetsLinksClickable();}
}

