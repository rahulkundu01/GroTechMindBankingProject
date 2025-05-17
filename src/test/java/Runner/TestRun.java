package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)				
@CucumberOptions(features={"src\\test\\java\\FeatureFiles"},
glue={"StepDefinations"},
//tags = "@High",
plugin = { "pretty", "html:target/site/cucumber-pretty.html",
"json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRun {

}
