package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        plugin = "pretty",
        features = {
                "src/test/java/cucumber/ErrorTest/Error.feature",
                "src/test/java/cucumber/VacunacionTest/vacunacion.feature"
        },
        glue = "com.aplication.covsin.cucumber"
)
@RunWith(Cucumber.class)
public class Runner {

}

