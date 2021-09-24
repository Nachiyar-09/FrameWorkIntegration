package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage extends PageObject {
    private WebDriver driver = getDriver();
    String name;
    String email;

    @Step("user click on the subscribe button")
    public void clickSubscribeButtonInHeader()
    {
        $("#Subscriber_link").click();
    }
    @Step("User provide the details in name field")
    public void  EnterNameInSubscription(String name) {
        $("#subscriber_name").type(name);}

    @Step("verify name with validation")
    public String verifyName(){
          String  ErrorMessage = $("//span[@for='subscriber_name']").getText();
          System.out.println("Error message captured" + ErrorMessage);
            return ErrorMessage;
        }


    @Step("user provide value in the email field")
    public void EnterEmailDetails(String email) {
        $("#subscriber_email").type(email);
    }
    @Step("verify name with validation")
    public String  verifyEmail(){
        String  ErrorMessage = $("//span[@for='subscriber_email']").getText();
        System.out.println("Error message captured" + ErrorMessage);
        return ErrorMessage;

     //   } else {
         //  return driver.findElement(By.xpath("//span[text()='Expected format: admin@example.com']")).getText();

    }

        @Step("Hit the subscribe button")
    public void SubscribeButtonSubmit()
    {
        $("#btnSubscribe").click();
    }
    @Step("Verify successful Subscription")
    public String verifySubscription(){
        return $("//div[@class='message success']").getText();
    }


    public AdminPage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new AdminPage();
    }


}
