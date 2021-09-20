package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {
    // public static WebDriver driver;

    @Step("User navigates to the application")
    public String NavigateToApplication(){

        String AppTitle = getDriver().getTitle();
        return AppTitle;
    }
    @Step("User provide Username")
    public void EnterUserName(String username)
    {
        $("#txtUsername").type(username);
    }

    @Step("User provide Password")
    public void EnterPassword(String password)
    {
        $("#txtPassword").typeAndEnter(password);
    }

    @Step("User Checks for proper navigation")
    public String properNextPageNavigation(){
      String MenuText =$("#menu_dashboard_index").getText();
      return MenuText;
    }
    @Step("Error Message on unsuccessful login")
    public String errorMessage() {
        String actualErrorMessage = $(By.id("spanMessage")).getText();
        return actualErrorMessage;
    }
    @Step("User checks the forgot password link")
    public void ClickForgotPasswordButton(){
        $("//a[normalize-space()='Forgot your password?']").click();
    }

    @Step("User verify the forgot password page")
    public void CheckForProperLanding(){
        Boolean resetPasswordButton = $(By.id("btnSearchValues")).isDisplayed();
        $("#btnCancel").click();
    }
    public DashboardPage DoLogin(String username, String password){
        $("#txtUsername").type(username);
        $("#txtPassword").typeAndEnter(password);
        return new DashboardPage();

         }
}
