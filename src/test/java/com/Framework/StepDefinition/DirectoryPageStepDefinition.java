package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.DirectoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jruby.dirgra.DataIterable;
import org.junit.Assert;

public class DirectoryPageStepDefinition {
    @Steps
    DirectoryPage directoryPage;

    @Given("user click on directory header option that is available")
    public void userClickOnDirectoryHeaderOptionThatIsAvailable() {
        directoryPage.ClickDirectory();
    }

    @When("User enter name in the search directory as {string}")
    public void userEnterNameInTheSearchDirectoryAsCecilBonaparte(String Name) {
        directoryPage.NameInDirectory(Name);
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        directoryPage.SearchButton();
    }



    @Then("User should able to see correct match of the name that is searched as {string}")
    public void userShouldAbleToSeeCorrectMatchOfTheNameThatIsSearchedAsCecilBonaparte(String CorrectMatch) {
        Assert.assertEquals(directoryPage.verifyCorrectMatch(),CorrectMatch);
    }
}
