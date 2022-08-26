package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    public String userEmail = "roxanatestare@gmail.com";
    public String userPass = "Testareplatforma!";
    public String userName = "Roxana Mihaela Pop";

    public String firstName = "Roxana";
    public String middleName = "Mihaela";
    public String lastName = "Pop";


    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected RegisterSteps registerSteps;

    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
