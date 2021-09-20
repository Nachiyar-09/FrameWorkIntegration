package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.DashboardPage;
import Com.FrameworkIntegration.Pages.LoginPage;
import Com.app.logger.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.slf4j.LoggerFactory;


public class LoginPageStepDefinition {
    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    Logger log = Log.getLogger(LoginPageStepDefinition.class);

    @Given("User navigates to the application")
    public void user_navigates_to_the_application() {
        loginPage.open();
        loginPage.NavigateToApplication();
        log.info("User Successfully launch the browser & navigated to application!------------");
    }
    @When("User enter value of username as {string} and password as {string}")
    public void user_provides_value_of_username_as_and_password_as(String UName, String Pass) {
        loginPage.EnterUserName(UName);
        loginPage.EnterPassword(Pass);

    }
    @Then("User should navigate to the application successfully and see the dashboard page")
    public void user_should_navigate_to_the_application_successfully_and_see_the_dashboard_page() {
        loginPage.properNextPageNavigation();
        log.info("-------------Login Success and landed in Dashboard page!------------");
        dashboardPage.clickLogoutButton();

    }
    @Then("User should able to see the error message as {string}")
    public void user_should_able_to_see_the_error_message_as(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        log.info("----------Login Unsuccessful and try again with correct credentials!----------");
    }
    @When("User click on the ForgotPassword link available")
    public void user_click_on_the_forgot_password_link_available() {
          loginPage.ClickForgotPasswordButton();
    }
    @Then("User should be redirected to Forgot Password page")
    public void user_should_be_redirected_to_forgot_password_page() {
          loginPage.CheckForProperLanding();
        log.info("--------------User is in ForgotPassword Page!----------");
    }



}
