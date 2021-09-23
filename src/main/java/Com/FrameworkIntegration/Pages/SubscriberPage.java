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
    public void EnterNameInSubscription(String name) {
        $("#subscriber_name").type(name);

    }

    @Step("user provide value in the email field")
    public String EnterEmailDetails(String email)
    {
        $("#subscriber_email").type(email);
        if(email.isEmpty()){
        return  $(By.xpath("//span[@for='subscriber_email']")).getText();
    }else{
        return $(By.xpath("//span[text()='Expected format: admin@example.com']")).getText();
    }

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
