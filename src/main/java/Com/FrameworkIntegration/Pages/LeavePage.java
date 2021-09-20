package Com.FrameworkIntegration.Pages;

import Com.app.logger.Log;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class LeavePage extends PageObject {

    private WebDriver driver= getDriver();

    Logger log = Log.getLogger(LeavePage.class);

    @Step("User click on the Leave menu available in the Header section")
    public void clickLeaveMenu() {
      $("#menu_leave_viewLeaveModule").click();
    }
                        //------------------Apply tab---------------------//
    @Step("User verifies the Page URl contains URL")
    public void ClickOnApplyDropDown(){
     $("#menu_leave_applyLeave").click();

    }
    @Step("User should able to see message")
    public String MessageOnApply() {
     return $("//div[@class='message warning']").getText();

    }
               //-------------------My Leave Tab-------------------------//
    @Step("User click on My Leave tab under leave")
    public void ClickMyLeave() {
        $("#menu_leave_viewMyLeaveList").click();
    }
    @Step("user provide the From date")
    public void EnterFromDate(String FromDate){
        $("#calFromDate").type(FromDate);
    }
    @Step("User click on Search button")
    public void ClickOnSearch(){
         $("#btnSearch").click();
    }
    @Step("User select the action from the drop down")
    public void  SelectAction(String action){
        $("#select_leave_action_62").selectByVisibleText(action);

    } @Step("User click on save button in the page")
    public void ClickOnSave(){
          $("#btnSave").click();
    }
          //-------------------------Entitlements Tab--------------------------//
         //--------------------------Add Entitlements-------------------------//

    @Step("User click on the Entitlements option")
    public void ClickOnEntitlement(){
     $("#menu_leave_Entitlements").click();
    }
    @Step("User click on Add Entitlements option")
    public void ClickAddLeaveEntitlement(){
        $("#menu_leave_addLeaveEntitlement").click();
    }
    @Step("click on the Add Multiple Employees")
    public void ClickAddMultipleEmployee(){
        $("#entitlements_filters_bulk_assign").click();
    }
   /* @Step("enter on the Employees name")
    public void EnterEmployeeName(String EName){
        $("#entitlements_employee_empName").sendKeys(EName);
    }*/

    @Step("select the Leave type")
    public void SelectLeaveType(String LeaveType){
        $("#entitlements_leave_type").selectByVisibleText(LeaveType);
    }
    @Step("select Leave period")
    public void SelectLeavePeriod(String period){
        $("#period").selectByVisibleText(period);
    }
     @Step("Entitlement")
    public void EnterEntitlement(String Entitle){
        $("#entitlements_entitlement").type(Entitle);
    }
    @Step("click on confirm button")
    public void SwitchToAlertAndConfirm() {
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
               //-------------------Employee Entitlements page related features--------------//


    @Step("user click on the Employee Entitlement")
    public void ClickEmployeeEntitlement(){
         $("#menu_leave_viewLeaveEntitlements").click();
    }
    @Step("value of Employee")
    public void  EnterEmployee(String emp){
       $("#entitlements_employee_empName").type(emp);
    }
    @Step("click on Search button")
    public void ClickOnSearchButton(){
       $("#searchBtn").click();
    }
    @Step("click on ADD button")
    public void ClickOnAdd(){
      $("#btnAdd").click();
    }
    @Step("click on save button")
    public void ClickSave(){
       $("#btnSave").click();
    }

        //-----------------------My Leave Entitlement page related features------------//

    @Step("user click on the My Entitlement")
    public void ClickMyEntitlement(){
      $("#menu_leave_viewMyLeaveEntitlements").click();
    }
    @Step("user select the leave period")
    public void SelectLeavePeriodDrpDwn(String Leave){
        $("#period").selectByVisibleText(Leave);

    }
    @Step("User click on Search Button")
    public void ClickSearchButton(){
        $("#searchBtn").click();
    }
    @Step("Entitlement type")
    public String EntitlementType(){
      return $("//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]").getText();
    }

      //--------------------------@Configure--------------------//
      //------------------#Leave periods option----------------//
    @Step("User click on the Configure option")
    public void ClickConfigure(){
     $("#menu_leave_Configure").click();
    }
    @Step("user click on Leave Period")
    public void ClickLeavePeriod(){
      $("#menu_leave_defineLeavePeriod").click();
    }
    @Step("USer click on Edit option")
    public void ClickEdit(){
      $("#btnEdit").click();
    }
    @Step("User click on save button")
    public void Clksave(){
      $("#btnEdit").click();
    }
              //--------------------Leave Types-------------------//
    @Step("User click on Leave Type from drop down")
    public void ClickOnType(){
      $("#menu_leave_leaveTypeList").click();
    }
    @Step("Leave Type")
    public void ClickOnTypeCheckBox(){
        $("//a[normalize-space()='CAN - Matternity']").click();
        }
    @Step("Click on delete button")
    public void ClickDelete(){
     $("#btnDelete").click();
    }
    @Step("switch to the confirmation box to confirm")
    public void SwitchToConfirm(){
      driver.switchTo().alert().accept();
        }
        //---------------Work Week Option--------------------//

    @Step(" click on the Work Week option")
    public void ClickOnWorkWeekOption(){
         $("#menu_leave_defineWorkWeek").click();
    }
    @Step("hit on the Edit button")
    public void ClkEdit(){
        $("#saveBtn").click();
    }
    @Step("select Saturday as 'Half Day'")
    public void SelectDay(String Day){
         $("#WorkWeek_day_length_Saturday").selectByVisibleText(Day);
    }
    @Step("save the work week")
    public void Save(){
     $("#saveBtn").click();
    }

             //----------------------------AssignLeave----------------------

    @Step("user clicks on Assign Leave")
    public void ClickAssignLeave(){
       $("#menu_leave_assignLeave").click();
    }
    @Step("User enters the name")
    public void EnterLeaveName(String Empname){
      $("#assignleave_txtEmployee_empName").type(Empname);
    }
    @Step("selects the Leave type")
    public void TypeOfLeave(String type){
     $("#assignleave_txtLeaveType").selectByVisibleText(type);
    }
    @Step("From Date")
    public void FromDate(String Fromdate){
    $("#assignleave_txtFromDate").type(Fromdate);
    }
    @Step("To date")
    public void ToDate(String ToDate){
     $("#assignleave_txtToDate").type(ToDate);
    }
    @Step("Save button")
    public void AssignClick(){
        $("#assignBtn").click();
    }
    @Step("confirmation box to confirm")
    public void Confirmation(){
       driver.switchTo().alert().accept();
    }




}
