package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage extends PageObject {
    private WebDriver driver = getDriver();

    @Step("user click on the subscribe button")
    public void clickSubscribeButtonInHeader()
    {
        $("#Subscriber_link").click();
    }
    @Step("User provide the details in name field")
    public void EnterNameInSubscription(String name){
        $("#subscriber_name").type(name);

    }
    @Step("user provide value in the email field")
    public void EnterEmailDetails(String email){
        $("#subscriber_email").type(email);
    }
    @Step("Hit the subscribe button")
    public void SubscribeButtonSubmit(){
        $("#btnSubscribe").click();
    }
    @Step("Verify successful Subscription")
    public String verifySubscription(){
        return $("//div[@class='message success']").getText();

    }

    @Step
    public void EnterInvalidNameInSubscription(String SName){
        $("#subscriber_name").type(SName);
    }
    @Step
    public void EnterInvalidEmailInSubscription(String SEmail){
        $("#subscriber_email").type(SEmail);
    }
    @Step
    public String ErrorMessageInSubscription(){
        return $(By.xpath("//*[@class=\"validation-error\"]")).getText();

    }

    public AdminPage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new AdminPage();
    }
}
