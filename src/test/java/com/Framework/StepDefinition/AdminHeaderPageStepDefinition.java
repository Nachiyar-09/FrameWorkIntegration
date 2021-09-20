package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.AdminPage;
import Com.app.logger.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminHeaderPageStepDefinition {

        @Steps
        AdminPage adminPage;
    Logger log = Log.getLogger(AdminHeaderPageStepDefinition.class);

   // static final Logger log = (Logger) LoggerFactory.getLogger(AdminHeaderPageStepDefinition.class);

    @When("User clicks on the Admin link available on the header")
        public void user_clicks_on_the_admin_link_available_on_the_header() {
        log.info("-------------User is in Admin Page---------------------");
            adminPage.clickAdmin();
        }

        @When("User able to see user management option from drop down and click on it")
        public void user_able_to_see_user_management_option_from_drop_down_and_click_on_it() {
           adminPage.clickUserManagement();
        }

        @When("User from there able to see the users options and just click on it")
        public void user_from_there_able_to_see_the_users_options_and_just_click_on_it() {
            adminPage.clickUser();
        }

        @When("User should provide value in the Employee name as {string}")
        public void user_should_provide_value_in_the_employee_name_as(String EmpName) {
          adminPage.EnterEmployeeName(EmpName);
        }

        @When("User should provide the username as {string}")
        public void user_should_provide_the_username_as(String Username) {
            adminPage.EnterUserName(Username);
        }

        @When("User should select the status as {string} from the status dropdown")
        public void user_should_select_the_status_as_from_the_status_dropdown(String status) {
          adminPage.SelectStatus(status);
        }

        @When("User should enter value in password as {string}")
        public void user_should_enter_value_in_password_as(String Password) {
           adminPage.EnterPassword(Password);
        }

        @When("User should enter value in the confirm password as {string}")
        public void user_should_enter_value_in_the_confirm_password_as(String ConfPassword) {
          adminPage.EnterConfirmPassword(ConfPassword);
        }

        @Then("User should click on the save button")
        public void user_should_click_on_the_save_button() {
                adminPage.ClickOnSave();
          log.info("-------------User Completed Admin section!---------------");
        }


}
