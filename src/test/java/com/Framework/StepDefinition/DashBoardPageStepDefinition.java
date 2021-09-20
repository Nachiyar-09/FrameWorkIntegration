package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.DashboardPage;
import Com.FrameworkIntegration.Pages.LoginPage;
import Com.app.logger.Log;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class DashBoardPageStepDefinition {
    @Steps
    DashboardPage dashboardPage;

    @Steps
    LoginPage loginPage;

    Logger log = Log.getLogger(DashBoardPageStepDefinition.class);

    @Given("User launches to the application")
    public void user_launches_to_the_application(DataTable credTable) {
        loginPage.open();
        List<Map<String, String>> credList = credTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        dashboardPage = loginPage.DoLogin(userName,password);
        log.info("---------------User launch the application after successful login!---------");
    }


   @Given("User is on the dashboard page")
   public void userIsOnTheDashboardPage() {
       loginPage.properNextPageNavigation();
   }
    @When("User checks for all below header options availability")
    public void user_checks_for_all_below_header_options_availability(DataTable dataTable) {
    dashboardPage.CheckHeaderOption();
    }


   @Then("Header section should have count of {int}")
    public void header_section_should_have_count_of(int ExpectedCount) {
        Assert.assertEquals(dashboardPage.CountOfHeaderSection(),ExpectedCount);
        log.info("-------------Count matches with the application Menu item! ---------------");
    }

 /* @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        dashboardPage.CheckForDashBoardPage();

    }
    @When("User clicks on the Logout option")
    public void user_clicks_on_the_logout_option() {
       dashboardPage.clickLogoutButton();
    }
    @Then("User should navigate back to login page with panel name as {string}")
    public void user_should_navigate_back_to_login_page_with_panel_name_as(String Title) {
       dashboardPage.VerifyBackLoginPage(Title);
    }*/

}
