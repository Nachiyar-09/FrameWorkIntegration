package Com.FrameworkIntegration.Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdminPage extends PageObject {

    private PIMPage pimPage;
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
    public void selectUserRole(String role){
        $("#systemUser_userType").selectByVisibleText(role);

    }
    @Step
    public void EnterEmployeeNameAndVerify(String Name,String ErrorMessage) {
                  //Handling autosuggestion in Employee name
        $("#systemUser_employeeName_empName").type(Name);
        if(pimPage.EmployeeTable().contains(Name)){              // verify employee list from PIM module
             WebDriverWait wait = new WebDriverWait(getDriver(),30);
             wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[4]/ul")));

             List<WebElement> auto = getDriver().findElements(By.xpath("/html/body/div[4]/ul"));

             for( WebElement list : auto){
                 System.out.println("Values are = " + list.getText());
                 if(list.getText().contains(Name))
                     list.click();
             }}
         else{
             ErrorMessage = getDriver().findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[2]/span")).getText();
             System.out.println(ErrorMessage);

         }}
       @Step
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

