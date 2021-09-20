package com.Framework.StepDefinition;
import Com.FrameworkIntegration.Pages.SubscriberPage;
import ch.qos.logback.classic.Logger;
import io.cucumber.core.backend.StepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.LoggerFactory;

public class SubscriberPageStepDefinition {

    @Steps
    SubscriberPage subscriberPage;
    static final Logger log = (Logger) LoggerFactory.getLogger(SubscriberPageStepDefinition.class);

    @When("User clicks on the subscribe button available on the header")
    public void user_clicks_on_the_subscribe_button_available_on_the_header() {
     subscriberPage.clickSubscribeButtonInHeader();
        log.info("--------------User navigate to Subscribe Page!------------");
    }

    @And("User should provide value in the Name field as {string}")
    public void user_should_provide_value_in_the_name_field_as(String name) {
     subscriberPage.EnterNameInSubscription(name);
    }
    @And("User should provide value in the email field as {string}")
    public void user_should_provide_value_in_the_email_field_as(String email) {
     subscriberPage.EnterEmailDetails(email);
    }

    @And("user should click on the subscribe button")
    public void user_should_click_on_the_subscribe_button() {
        subscriberPage.SubscribeButtonSubmit();
    }

    @Then("User should see the successful subscription as {string}")
    public void user_should_see_the_successful_subscription_as(String actualMessage) {
        Assert.assertEquals(subscriberPage.verifySubscription(),actualMessage);
        log.info("---------------User Subscribed to the application!----------------");
    }

}