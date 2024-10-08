package StepDefinitions;

//import io.cucumber.java..Given
//import io.cucumber.java.Then
//import io.cucumber.java.When

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*; // * hepsini kapsıyor
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {

        System.out.println("Site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

        System.out.println("Username ve şifre gönderildi.");

//        dc.username.sendKeys("turkeyts"); wait + scroll + clear
//        dc.password.sendKeys("TechoStudy123"); wait + scroll + clear
//        dc.loginButton.click(); wait + scroll

        dc.mySendKeys(dc.username,"turkeyts");
        dc.mySendKeys(dc.password,"TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Siteye girildiği doğrulandı");

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.textToBePresentInElement(dc.headText, "Internship"));

//        Assert.assertTrue(dc.headText.getText().equals("Internship"));

        dc.verifyContainsText(dc.headText,"Internship");
    }
}
