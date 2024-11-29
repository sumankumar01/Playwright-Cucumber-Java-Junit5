package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Add_remove_elements;

public class AddRemoveElementsStepDef {

    Add_remove_elements elementsPage = new Add_remove_elements(DriverFactory.getPage());

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) throws Exception {
      throw new Exception();
    }
    @When("user clicks on {string} icon in main page")
    public void user_clicks_on_icon_in_main_page(String string) {

    }
    @When("verify element got added")
    public void verify_element_got_added() {

    }
}
