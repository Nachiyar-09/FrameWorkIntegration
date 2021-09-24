package Com.FrameworkIntegration.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class DirectoryPage extends PageObject {

    @Step("User checks URL for verifying Dashboard page")
    public void CheckPageURL(String KeyWord){
        String CurrentPage = getDriver().getCurrentUrl();
        CurrentPage.contains(KeyWord);

    }
    @Step("user click on directory link")
    public void ClickDirectory(){
        $("#menu_directory_viewDirectory").click();

    }
    @Step("user enter name in directory page")
    public void NameInDirectory(String Name){
        $("#searchDirectory_emp_name_empName").type(Name);

    }
    @Step("user click on search")
    public void SearchButton(){
        $("#searchBtn").click();

    }
    @Step("user click on directory link")
    public String verifyCorrectMatch(){
       return  $("//b[normalize-space()='Cecil Bonaparte']").getText();

    }


}
