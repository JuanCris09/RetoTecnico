package co.sqasa.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features/test.feature"
        //snippets = SnippetType.CAMELCASE
)
public class testRunner {
}
