package cucumber.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\MF\\IdeaProjects\\GraduationProject\\src\\main\\resources\\Features",
        glue = "cucumber.stepdef",
        tags = "@smoke",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"

        }

)
public class runner extends AbstractTestNGCucumberTests {
}
