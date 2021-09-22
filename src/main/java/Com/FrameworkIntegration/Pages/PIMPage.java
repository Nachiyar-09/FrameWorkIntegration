package Com.FrameworkIntegration.Pages;

import Com.app.logger.Log;
import io.cucumber.plugin.event.StepDefinition;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

public class PIMPage extends PageObject {
    private WebDriver driver= getDriver();

    Logger log = Log.getLogger(PIMPage.class);

    @Step("User clicks on the PIM header option available ")
    public void clickOnPIMHeaderMenu(){
        log.info("----------------User going to test PIM Module!------------------");
        $("#menu_pim_viewPimModule").click();
    }

    @Step("User clicks on the Configuration option available under PIM ")
    public void clickOnConfigurationUnderPIM(){
        $("#menu_pim_Configuration").click();
    }
                        //--------------optional configure-------------------//

    @Step("User clicks on the Optional Fields option available under Configuration ")
    public void clickOnOptionalFields(){
        $("#menu_pim_configurePim").click();
    }
    @Step("User clicks on the Edit button available under Configure PIM page ")
    public void clickOnEditConfigurePIM(){
        $("#btnSave").click();
    }
    @Step("User clicks on the save button available under Configure PIM page ")
    public void clickOnSaveConfigurePIM(){
        $("//input[@value='Save']").click();
        log.info("---------------User saved the Optional Configure!----------");
    }

                           //----------------Custom Fields-------------------//

    @Step
    public void ClickOnCustomFieldsOption(){

        $("#menu_pim_listCustomFields").click();
        $("#buttonAdd").click();
    }
    @Step()
    public void EnterFieldName(String name){

        $("#customField_name").type(name);
    }
    @Step()
    public void selectScreenDropDown(String screen){

        $("#customField_screen").selectByVisibleText(screen);
    }
    @Step()
    public void selectType(String type){

        $("#customField_type").selectByVisibleText(type);
    }
    @Step()
    public void clickOnSaveBtn(){
        $("#btnSave").click();
        log.info("---------------User saved the Custom Configure!----------");
    }

                      //----------------Data Import---------------------//

    @Step
    public void ClickOnDataImportDropDown(){
        $("#menu_admin_pimCsvImport").click();
    }
    @Step
    public void ClickOnChooseFileButton(){
        WebElement ChooseFile = $("#pimCsvImport_csvFile");
        upload("C:\\Users\\2041048\\Downloads\\importData.csv").to(ChooseFile);
    }
    @Step
    public void ClickOnUpload(){
        $("#btnSave").click();
        log.info("---------------User saved the Data Import Configuration!----------");
    }

    //--------------------Reporting Methods-------------------//
    @Step
    public void clickOnReportingMethod(){
        $("#menu_pim_viewReportingMethods").click();
    }
    @Step
    public void clickOnAdd(){
        $("#btnAdd").click();
    }
    @Step
    public void enterName(String reportingName){
        $("#reportingMethod_name").type(reportingName);
    }
    @Step
    public void clickOnSave(){
        $("#btnSave").click();
        log.info("---------------User saved the Reporting Methods!----------");
    }

              //---------------------Termination Reason------------------------//

    @Step
    public void ClickTerminationReasonFromDropDown(){
        $("#menu_pim_viewTerminationReasons").click();
    }
    @Step
    public void ClickAddButton(){
        $("#btnAdd").click();
    }
    @Step
    public void EnterNameInTerminationPage(String reason){
        $("#terminationReason_name").type(reason);
    }
    @Step
    public void ClickSave(){
        $("#btnSave").click();
        log.info("---------------User saved the Termination Reason!----------");
        log.info("---------------User saved all Configuration!----------");
    }
                     //-------------------- Employee List tab---------------------------//
    @Step()
    public void ClickOnEmployeeList(){
        $("#menu_pim_viewEmployeeList").click();
    }

    @Step("Working with Emp tables")
     public String EmployeeTable() {
       /* //Count entire columns in the table
        List<WebElement> ColumnCount = driver.findElements(By.tagName("th"));
        System.out.println("Column count is " + ColumnCount.size());

        //count entire rows in the table
        List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
        System.out.println("Row count is " + rowCount.size());*/

        //Scrolling down to the page
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform();

        //Get All Employees Name present in the table
        List<WebElement> FirstNameColumnValue = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]"));

        AllEmployeeName = new ArrayList<String>();
        for (WebElement ele : FirstNameColumnValue) {
            String EmployeeName = ele.getText();
            AllEmployeeName.add(EmployeeName);
        }
        return AllEmployeeName.toString();
    }
    @Step
    public LeavePage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new LeavePage();
    }
}
                  //-------------------- Employee List tab---------------------------//
    @Step()
    public void ClickOnEmployeeList(){
        $("#menu_pim_viewEmployeeList").click();
    }

    @Step("Working with Emp tables")
     public String EmployeeTable() {
       /* //Count entire columns in the table
        List<WebElement> ColumnCount = driver.findElements(By.tagName("th"));
        System.out.println("Column count is " + ColumnCount.size());

        //count entire rows in the table
        List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
        System.out.println("Row count is " + rowCount.size());*/

        //Scrolling down to the page
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform();

        //Get All Employees Name present in the table
        List<WebElement> FirstNameColumnValue = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]"));

        AllEmployeeName = new ArrayList<String>();
        for (WebElement ele : FirstNameColumnValue) {
            String EmployeeName = ele.getText();
            AllEmployeeName.add(EmployeeName);
        }
        return AllEmployeeName.toString();
    }
    @Step
    public LeavePage CheckForDashBoardPage() {
        boolean Content = $("#welcome").containsElements("Welcome");
        return new LeavePage();
    }
}
