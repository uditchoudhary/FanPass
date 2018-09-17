package FanPassStepDefs;

import FanPassPages.FanPass;
import FanPassPages.FanPassLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

/**
 * Created by udit on 16/09/18.
 */
public class MyStepdefs extends FanPass {
    @When("^I login$")
    public void iLogin() {
        fanPassLoginPage.performLogin();
        System.out.println("iLogin");
    }

    @Given("^I am an authorized Fanpass user$")
    public void iAmAnAuthorizedFanpassUser() throws Throwable {
        System.out.println("iAmAnAuthorizedFanpassUser");
    }

    @Then("^I should see \"([^\"]*)\" option$")
    public void iShouldSeeOption(String arg0) throws Throwable {
        System.out.println("iShouldSeeOption");

    }

    @Given("^I am not an unauthorized Fanpass user$")
    public void iAmNotAnUnauthorizedFanpassUser() throws Throwable {
        System.out.println("iAmNotAnUnauthorizedFanpassUser");

    }

    @When("^I try to login$")
    public void iTryToLogin() throws Throwable {
        System.out.println("iTryToLogin");

    }

    @Then("^I should see an alert message$")
    public void iShouldSeeAnAlertMessage() throws Throwable {
        System.out.println("iShouldSeeAnAlertMessage");

    }

    @And("^I should not be allowed to login$")
    public void iShouldNotBeAllowedToLogin() throws Throwable {
        System.out.println("iShouldNotBeAllowedToLogin");

    }
}
