package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class AdminPage extends PageObject {

    private WebDriver driver = getDriver();
    @Step
    public void clickAdmin(){
        $("#menu_admin_viewAdminModule").click();
    }
    @Step
    public void clickUserManagement()  {
        $("#menu_admin_UserManagement").click();

    }
    @Step
    public void clickUser(){
        $("#menu_admin_viewSystemUsers").click();
        $("#btnAdd").click();
    }
    @Step
    public void EnterEmployeeName(String EmpName){
        $("#systemUser_employeeName_empName").type(EmpName);
    }@Step
public void EnterUserName (String Username){
    $("#systemUser_userName").type(Username);
}
    @Step
    public void SelectStatus(String status){
        $("#systemUser_status").selectByVisibleText(status);
    }
    @Step
    public void EnterPassword(String Password){
        $("#systemUser_password").type(Password);
    }
    @Step
    public void EnterConfirmPassword (String ConfPassword){
        $("#systemUser_confirmPassword").type(ConfPassword);
    }
    @Step
    public void ClickOnSave(){
        $("#btnSave").click();
    }
    public PIMPage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new PIMPage();
    }
}