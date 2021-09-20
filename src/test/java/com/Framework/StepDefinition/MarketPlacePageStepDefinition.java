package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.DashboardPage;
import Com.FrameworkIntegration.Pages.MarketPlacePage;
import Com.app.logger.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.slf4j.LoggerFactory;

public class MarketPlacePageStepDefinition {

  @Steps
    MarketPlacePage marketPlacePage;
    @Steps
    DashboardPage dashboardPage;

    Logger log = Log.getLogger(MarketPlacePageStepDefinition.class);

    @When("User click on Marketplace button")
    public void userClickOnMarketplaceButton() {
        marketPlacePage = dashboardPage.CheckForDashBoardPage();
        marketPlacePage.ClickMarketPlaceButton();
        log.info("-------------User navigates to MarketPlace page!------------");
    }

  @And("User checks URL for verifying MarketPlace page through Keyword {string}")
  public void userChecksURLForVerifyingMarketPlacePageThroughKeywordMarketPlace(String KeyWord)
    {
        marketPlacePage.CheckForURL(KeyWord);
        log.info("-------------User landed in MarketPlace page!------------");

    }

    @Then("User checks for the Addons title as {string}")
    public void userChecksForTheAddonsTitleAsOrangeHRMAddons(String title) {
       Assert.assertEquals(marketPlacePage.AddonsTitle(),title);

    }


}
