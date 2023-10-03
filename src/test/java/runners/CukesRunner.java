package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/reports/html/html_reports.html",
                "json:target/reports/json/json-reports/cucumber.json",
                "junit:target/reports/xml/xml-report/cucumber.xml",
                "rerun:target/reports/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = "src/test/resources/uifeatures",
        glue = {"stepDefinitions","hooks"},

        dryRun = false,
        tags = "@US024"


)
public class CukesRunner {
}
