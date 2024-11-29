package stepdefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.WebActions;

import java.nio.file.Paths;

public class LoginStepDef {

    LoginPage elementsPage = new LoginPage(DriverFactory.getPage());


    @Given("I am on the orangehrm sites {string}")
    public void iAmOnTheOrangehrmSites(String arg0)  {
        elementsPage.getPage().navigate(WebActions.getProperty(arg0));
    }

    @When("I enter {string} as a userName to login")
    public void iEnterAsAUserNameToLogin(String arg0) {
        elementsPage.EnterUserName(arg0);
    }

    @When("I enter {string} as a password to login")
    public void iEnterAsAPasswordToLogin(String arg0) {
        elementsPage.EnterPassword(arg0);
    }

    @Then("I verify home page")
    public void iVerifyHomePage() {
        elementsPage.ClickSubmit();
    }


}
