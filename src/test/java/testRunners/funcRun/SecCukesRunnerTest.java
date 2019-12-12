package testRunners.funcRun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
    features = "src/test/resources/features",
    glue = {"stepdefinitions"},
    plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
)
public class SecCukesRunnerTest extends AbstractTestNGCucumberTests{}