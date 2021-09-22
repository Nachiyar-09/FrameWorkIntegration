package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.PIMPage;
import Com.app.logger.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class PIMHeaderPageStepDefinition {

    @Steps
    PIMPage pimPage;

    Logger log = Log.getLogger(PIMHeaderPageStepDefinition.class);

              //-----------Optional configure-----------------//
    @When("User clicks on the PIM header option available")
    public void user_clicks_on_the_pim_header_option_available() {
        pimPage.clickOnPIMHeaderMenu();
    }

    @When("User clicks on the Configuration option available under PIM")
    public void user_clicks_on_the_configuration_option_available_under_pim() {
        pimPage.clickOnConfigurationUnderPIM();
    }

    @When("User clicks on the Optional Configure option")
    public void user_clicks_on_the_optional_configure_option() {
       pimPage.clickOnOptionalFields();
    }

    @When("User clicks on the Edit button that is available in the page")
    public void user_clicks_on_the_edit_button_that_is_available_in_the_page() {
        pimPage.clickOnEditConfigurePIM();
    }

    @Then("User can hit the Save button once all changes are done")
    public void user_can_hit_the_save_button_once_all_changes_are_done() {
        pimPage.clickOnSaveConfigurePIM();
        log.info("---------------User Saved the Optional Configure!-------------");
    }

              //----------------Custom Fields-------------------//
    @When("User select on custom fields option from drop down")
    public void user_select_on_custom_fields_option_from_drop_down() {
        pimPage.ClickOnCustomFieldsOption();
    }

    @When("User should enter Field name as {string}")
    public void user_should_enter_field_name_as(String name) {
       pimPage.EnterFieldName(name);
    }

    @When("User selects the screen type as {string}")
    public void user_selects_the_screen_type_as(String screen) {
        pimPage.selectScreenDropDown(screen);
    }

    @When("User selects the type as {string}")
    public void user_selects_the_type_as(String type) {
       pimPage.selectType(type);
    }

    @Then("User click on the Save")
    public void user_click_on_the_save() {
        pimPage.clickOnSaveBtn();
        log.info("---------------User Saved the Custom Configure!-------------");
    }
               //----------------Data Import---------------------//

    @When("User clicks on the Data import drop down option")
    public void user_clicks_on_the_data_import_drop_down_option() {
        pimPage.ClickOnDataImportDropDown();
    }

    @When("User upload file using Choose File button")
    public void user_upload_file_using_choose_file_button() {
        pimPage.ClickOnChooseFileButton();
    }

    @Then("User click on the Upload Button")
    public void user_click_on_the_upload_button() {
        pimPage.ClickOnUpload();
        log.info("---------------User Saved the Data Import!-------------");
    }

    //--------------------Reporting Methods-------------------//

    @When("User click on the Reporting method link")
    public void user_click_on_the_reporting_method_link() {
        pimPage.clickOnReportingMethod();
    }

    @When("User click on add button")
    public void user_click_on_add_button() {
        pimPage.clickOnAdd();
    }

    @When("User enters name in the provided field value as {string}")
    public void user_enters_name_in_the_provided_field_value_as(String reportingName) {
        pimPage.enterName(reportingName);
    }

    @Then("User click on the Save option")
    public void user_click_on_the_save_option() {
       pimPage.clickOnSave();
        log.info("---------------User Saved the Reporting Methods!-------------");
    }
    //---------------------Termination Reason------------------------//

    @When("User clicks on the Termination link from drop down")
    public void user_clicks_on_the_termination_link_from_drop_down() {
        pimPage.ClickTerminationReasonFromDropDown();
    }

    @When("User click on ADD button available in that page")
    public void user_click_on_add_button_available_in_that_page() {
       pimPage.ClickAddButton();
    }

    @When("User enter name in the field provided as {string}")
    public void user_enter_name_in_the_field_provided_as(String reason) {
       pimPage.EnterNameInTerminationPage(reason);
    }

    @Then("User click on the Save button")
    public void user_click_on_the_save_button() {
       pimPage.ClickSave();
        log.info("---------------User Saved the Termination Reason!-------------");
    }
     @When("User clicks on the Employee List link tab")
    public void userClicksOnTheEmployeeListLinkTab() {
        pimPage.clickOnPIMHeaderMenu();
        pimPage.ClickOnEmployeeList();
    }
    @Then("Store the value of tables")
    public void storeTheValueOfTables() {
        pimPage.EmployeeTable();
    }
}
