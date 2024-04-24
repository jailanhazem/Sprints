package org.example.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features" ,
                glue = "org.example.StepDef"  ,
                tags = "@smoke" ,
                plugin = {
                        "pretty",
                       "html:target/cucumber.html",
                       "json:target/cucumber.json",
                }
        )

public class Report extends AbstractTestNGCucumberTests {
}
