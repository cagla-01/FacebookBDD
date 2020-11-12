package runnerTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json: target/cucumber-html-reports/cucumber"},

        //This create auto method name in camelCase

        monochrome = true,
        dryRun = false,

        //Path to your feature file
        features = {"/Users/caglaercankuyucu/IdeaProjects/x/src/test/resources/features"},

        // Specify tags to be executed
        tags = "@messenger",

        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepDefinition"}

)

public class TestRunner {
//don't write any code

}
