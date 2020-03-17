package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/features/Guru99.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@tc01_guru99"},
glue = {"steps"},
monochrome = true
)

public class guru99_runner {
	


}
