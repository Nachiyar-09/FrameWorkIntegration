package Com.FrameworkIntegration.Pages;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends PageObject {

    private WebDriver driver = getDriver();
    private By ListOfMenus = By.id("mainMenuFirstLevelUnorderedList");
    
      // Steps for Logout functions//
    
    /* @Step("User is on the dashboard page")
     public boolean CheckForDashBoardPage() {
         boolean Content = $("#welcome").containsElements("Welcome");
         return Content;
     }

     @Step("Verify whether user navigates back to login page")
     public void VerifyBackLoginPage(String Title){
         String LoginPanel = $("#logInPanelHeading").getText();
         Assert.assertEquals(LoginPanel,Title);
     }*/
    @Step("User click on Logout option")
    public void clickLogoutButton() {
        $("#welcome").click();
        $("//*[@id=\"welcome-menu\"]/ul/li[3]/a").click();
    }
            // Verify all header tabs are available in dashboard//
    
    @Step("User checks for all below header options availability")
    public List<String> CheckHeaderOption() {

        List<String> MenuHeader = new ArrayList<>();
        List<WebElement> AllMenuList = driver.findElements((ListOfMenus));
        for (WebElement e : AllMenuList) {
            String text = e.getText();
            MenuHeader.add(text);
        }
        return MenuHeader;
    }
        // Count all headers available and match it with feature file//
    
    @Step("User checks for all below header options availability")
    public int CountOfHeaderSection() {
        WebElement header = driver.findElement((ListOfMenus));
        List<WebElement> Menu = header.findElements(By.xpath("//*[@class=\"firstLevelMenu\"]"));
        int noOfLinks = Menu.size();
        System.out.println(noOfLinks);
        return noOfLinks;
    }
           // Page chaining - next page object created //
    public MarketPlacePage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new MarketPlacePage();
    }

}
