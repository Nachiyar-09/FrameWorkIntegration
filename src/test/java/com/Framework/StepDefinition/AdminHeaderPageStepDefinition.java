package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.AdminPage;
import Com.FrameworkIntegration.Pages.DashboardPage;
import Com.app.logger.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminHeaderPageStepDefinition {

        @Steps
        AdminPage adminPage;
         @Steps
    DashboardPage dashboardPage;

    Logger log = Log.getLogger(AdminHeaderPageStepDefinition.class);



    @When("User clicks on the Admin link available on the header")
        public void user_clicks_on_the_admin_link_available_on_the_header() {
        log.info("-------------User is in Admin Page---------------------");
            adminPage.clickAdmin();
        }
    @And("User verify the Page URL contains {string}")
    public void userVerifyThePageURLContainsAdmin(String KeyWord) {
        dashboardPage.CheckPageURL(KeyWord);
        log.info("------------------User verifies the Admin page URL---------------");
    }
    @And("User able to see user management option from drop down and click on it")
        public void user_able_to_see_user_management_option_from_drop_down_and_click_on_it() {
           adminPage.clickUserManagement();
        }

    @And("User from there able to see the users options and just click on it")
        public void user_from_there_able_to_see_the_users_options_and_just_click_on_it() {
            adminPage.clickUser();
        }
    @And("User select the user role as {string}")
    public void userSelectTheUserRoleAsAdmin(String role) {
        adminPage.selectUserRole(role);
    }

    @And("User should select name of the Employee as {string} from auto suggestion and check for {string}")
    public void userShouldSelectNameOfTheEmployeeAsEmpNameFromAutoSuggestionAndCheckForErrorMessage(String Name, String ErrorMessage ) {
           adminPage.EnterEmployeeNameAndVerify(Name,ErrorMessage);
    }

    @And("User should provide the username as {string}")
        public void user_should_provide_the_username_as(String Username) {
            adminPage.EnterUserName(Username);
        }

    @And("User should select the status as {string} from the status dropdown")
        public void user_should_select_the_status_as_from_the_status_dropdown(String status) {
          adminPage.SelectStatus(status);
        }

    @And("User should enter value in password as {string}")
        public void user_should_enter_value_in_password_as(String Password) {
           adminPage.EnterPassword(Password);
        }

    @And("User should enter value in the confirm password as {string}")
        public void user_should_enter_value_in_the_confirm_password_as(String ConfPassword) {
          adminPage.EnterConfirmPassword(ConfPassword);
        }
        @Then("User should click on the save button")
        public void user_should_click_on_the_save_button() {
                adminPage.ClickOnSave();
          log.info("-------------User Completed Admin section!---------------");
        }



}
