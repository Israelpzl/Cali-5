package com.aplication.covsin.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {
                "src/test/java/com/aplication/covsin/cucumber/ErrorTest/Error.feature",
                "src/test/java/com/aplication/covsin/cucumber/VacunacionTest/vacunacion.feature",
                "src/test/java/com/aplication/covsin/cucumber/smokeTest/Login.feature"
        },
        glue = "com.aplication.covsin.cucumber"
)
public class Runner {

}

