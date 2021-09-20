package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;


public class MarketPlacePage extends PageObject {
    private WebDriver driver = getDriver();

    @Step("User click on Marketplace button")
    public void ClickMarketPlaceButton(){
        $("#MP_link").click();
    }

    @Step("User checks URL for verifying MarketPlace page")
    public void CheckForURL(String KeyWord){
        String CurrentPage = getDriver().getCurrentUrl();
        System.out.println(CurrentPage);
        CurrentPage.contains(KeyWord);

    }

   @Step("User checks for the Addons title")
    public String AddonsTitle(){
       return $("//h1[normalize-space()='OrangeHRM Addons']").getText();

    }

    public SubscriberPage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new SubscriberPage();
    }
}
