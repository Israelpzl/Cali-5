package features;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        plugin = "pretty",
        features = {
                "src/test/java/features/ErrorTest/Error.feature",
                "src/test/java/features/VacunacionTest/vacunacion.feature"
        },
        glue = "feature.step_definitions"
)
@RunWith(Cucumber.class)
public class Runner {

}

