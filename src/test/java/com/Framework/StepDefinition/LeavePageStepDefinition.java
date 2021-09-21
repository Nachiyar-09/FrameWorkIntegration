package com.Framework.StepDefinition;

import Com.FrameworkIntegration.Pages.DashboardPage;
import Com.FrameworkIntegration.Pages.LeavePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LeavePageStepDefinition {

    @Steps
    LeavePage leavePage;

    @Steps
    DashboardPage dashBoardPage;

    @Given("User click on the Leave menu available in the Header section")
    public void userClickOnTheLeaveMenuAvailableInTheHeaderSection() {
        leavePage.clickLeaveMenu();
    }

    @Then("User verifies the Page URl contains URL with Keyword {string}")
    public void userVerifiesThePageURlContainsURLWithKeywordLeave(String KeyWord) {
        dashBoardPage.CheckPageURL(KeyWord);
    }

    @When("User click on the Apply tab under Leave module")
    public void userClickOnTheApplyTabUnderLeaveModule() {
        leavePage.ClickOnApplyDropDown();
    }
    @Then("User should able to see message as {string}")
    public void userShouldAbleToSeeMessageAsNoLeaveTypesWithLeaveBalance(String expected) {
        Assert.assertEquals(leavePage.MessageOnApply(),expected);
    }
  /*  @And("User select leave type {string}")
    public void userSelectLeaveTypeCANPersonal(String type) {
        leavePage.selectLeaveType(type);
    }

    @And("user select From and To Date")
    public void userSelectFromAndToDate() {
        leavePage.ApplyFromDate();
        leavePage.ApplyToDate();
    }

    @And("User should enter comment as {string}")
    public void userShouldEnterCommentAsFirstCommentInLeave(String comment) {
        leavePage.Comments(comment);
    }

    @Then("User should able to click Apply button")
    public void userShouldAbleToClickApplyButton() {
        leavePage.ClickApply();
    }
*/

    //-------------------My Leave Tab-------------------------//
    @When("User click on My Leave tab under leave")
    public void userClickOnMyLeaveTabUnderLeave() {
        leavePage.ClickMyLeave();
    }

    @When("user provide the From date as {string}")
    public void userProvideTheFromDateAs(String FromDate) {
        leavePage.EnterFromDate(FromDate);
    }

    @And("User click on Search button")
    public void userClickOnSearchButton() {
        leavePage.ClickOnSearch();
    }

    @And("User select the action from the drop down as {string}")
    public void userSelectTheActionFromTheDropDownAsCancel(String action) {
        leavePage.SelectAction(action);
    }

    @Then("User click on save button in the page")
    public void userClickOnSaveButtonInThePage() {
        leavePage.ClickOnSave();
    }

                //-------------------------Entitlements Tab--------------------------//
                //--------------------------Add Entitlements-------------------------//
    @When("User click on the Entitlements option available under Leave section")
    public void userClickOnTheEntitlementsOptionAvailableUnderLeaveSection() {
        leavePage.ClickOnEntitlement();

    }

    @When("User click on Add Entitlements option from drop down")
    public void userClickOnAddEntitlementsOptionFromDropDown() {
        leavePage.ClickAddLeaveEntitlement();
    }

    @And("User should click on the Add Multiple Employees check box")
    public void userShouldClickOnTheAddMultipleEmployeesCheckBox() {
        leavePage.ClickAddMultipleEmployee();
    }

   /* @And("User enters employee name as {string}")
    public void userEntersEmployeeNameAsJoeRoot(String EName) {
        leavePage.EnterEmployeeName(EName);
    }*/

    @And("User should select the Leave type as {string} from drop down")
    public void userShouldSelectTheLeaveTypeAsCANFMLAFromDropDown(String LeaveType) {
        leavePage.SelectLeaveType(LeaveType);
    }

    @And("User should select Leave period from {string}")
    public void userShouldSelectLeavePeriodFrom(String period) {
        leavePage.SelectLeavePeriod(period);
    }

    @And("User should enter number with two decimal place in Entitlement as {string}")
    public void userShouldEnterNumberWithTwoDecimalPlaceInEntitlementAs(String Entitle) {
        leavePage.EnterEntitlement(Entitle);
    }

    @Then("user should switch to the frame available to click on confirm button")
    public void userShouldSwitchToTheFrameAvailableToClickOnConfirmButton() throws InterruptedException {
        leavePage.SwitchToAlertAndConfirm();
    }
    //-------------------Employee Entitlements page related features--------------//

    @When("user click on the Employee Entitlement from Entitlements drop  down")
    public void userClickOnTheEmployeeEntitlementFromEntitlementsDropDown() {
        leavePage.ClickEmployeeEntitlement();
    }

    @And("user provides value of Employee as {string}")
    public void userProvidesValueOfEmployeeAsJadineJackie(String emp) {
        leavePage.EnterEmployee(emp);
    }

    @And("User search the employee through Search button")
    public void UsersearchtheemployeethroughSearchbutton() {
        leavePage.ClickOnSearchButton();
    }

    @And("User click on ADD button")
    public void userClickOnADDButton() {
        leavePage.ClickOnAdd();
    }

    @Then("User click on save button")
    public void userClickOnSaveButton() {
        leavePage.ClickSave();
    }
    //-----------------------My Leave Entitlement page related features------------//
    @When("user click on the My Entitlement from Entitlements drop  down")
    public void userClickOnTheMyEntitlementFromEntitlementsDropDown() {
        leavePage.ClickMyEntitlement();
    }

    @And("User select the leave period as {string}")
    public void userSelectTheLeavePeriodAs(String Leave) {
        leavePage.SelectLeavePeriodDrpDwn(Leave);
    }

    @And("User click Search Button")
    public void userClickSearchButton() {
        leavePage.ClickSearchButton();
    }


    @And("User should verify whether Entitlement type displayed as {string}")
    public void userShouldVerifyWhetherEntitlementTypeDisplayedAsAdded(String type) {
        Assert.assertEquals(leavePage.EntitlementType(),type);
    }
                //--------------------------@Configure--------------------//
                 //------------------#Leave periods option----------------//

    @When("User click on the Configure option")
    public void userClickOnTheConfigureOption() {
       leavePage.ClickConfigure();
    }

    @When("user click on Leave Period drop down option")
    public void userClickOnLeavePeriodDropDownOption() {
    leavePage.ClickLeavePeriod();
    }

    @And("USer click on Edit option")
    public void userClickOnEditOption() {
        leavePage.ClickEdit();
    }

    @When("User click on Leave Type from drop down")
    public void userClickOnLeaveTypeFromDropDown() {
        leavePage.ClickOnType();
    }

    @And("User select the CAN - Matternity check box from listed types")
    public void userSelectTheCANMatternityCheckBoxFromListedTypes() {
        leavePage.ClickOnTypeCheckBox();
    }

    @And("User click on delete button")
    public void userClickOnDeleteButton() {
        leavePage.ClickDelete();
    }

    @Then("User switch to the confirmation box to confirm the delete action")
    public void userSwitchToTheConfirmationBoxToConfirmTheDeleteAction() {
        leavePage.SwitchToConfirm();
    }
                 //---------------Work Week option--------------------//
    @When("user click on the Work Week option from drop down")
    public void userClickOnTheWorkWeekOptionFromDropDown() {
        leavePage.ClickOnWorkWeekOption();
    }

    @And("User hit on the Edit button that is available in the page")
    public void userHitOnTheEditButtonThatIsAvailableInThePage() {
        leavePage.ClkEdit();
    }

    @And("User select Saturday as {string} of work from drop down")
    public void userSelectSaturdayAsHalfDayOfWorkFromDropDown(String Day) {
        leavePage.SelectDay(Day);
    }

    @Then("User save the work week")
    public void userSaveTheWorkWeek() {
        leavePage.Save();
    }

    //---------------------------------Assign Leave----------------------------//
    @When("user clicks on Assign Leave")
    public void userClicksOnAssignLeave() {
        leavePage.ClickAssignLeave();
    }

    @And("User enters the name {string}")
    public void userEntersTheNameOrangeTest(String Empname) {
        leavePage.EnterLeaveName(Empname);
    }

    @And("User selects the Leave type as {string}")
    public void userSelectsTheLeaveTypeAsCANVacation(String type) {
        leavePage.TypeOfLeave(type);
    }

    @And("User should enter date in From Date")
    public void userShouldEnterDateInFromDate() {
        leavePage.FromDate();
    }

    @And("User should enter date in To date")
    public void userShouldEnterDateInToDate() {
        leavePage.ToDate();
    }

    @And("User hit on the Assign button")
    public void userHitOnTheAssignButton() {
        leavePage.AssignClick();
    }

    @Then("User switch to confirmation box to confirm")
    public void userSwitchToConfirmationBoxToConfirm() {
        leavePage.Confirmation();
    }


}
