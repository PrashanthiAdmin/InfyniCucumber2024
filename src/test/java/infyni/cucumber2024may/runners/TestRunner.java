package infyni.cucumber2024may.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features"},
                                        glue = {"infyni.cucumber2024may.stepdefintions"},              		       
                                        plugin = {"pretty", "html:target/cucumber-reports/cucumberreport.html",
                                        		"json:target/cucumber-reports/cucumbertestreport.json"},
                                        tags = "@regression",
                                        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
