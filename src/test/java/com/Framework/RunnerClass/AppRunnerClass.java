package com.Framework.RunnerClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.Framework.StepDefinition")

public class AppRunnerClass {
}
