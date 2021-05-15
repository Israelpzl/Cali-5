package cucumber.VacunacionTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class VacunacionTest {

    String message;

    @Given("^una página web del ministerio con toda la infromación de la vacunación$")
    public void given() throws Throwable {
        System.out.println("El usuario pulsa el boton de vacunacion.");
    }

    @When("^cuando se pulsa el botón \"([^\"]*)\"$")
    public void when(String strArg1) throws Throwable {
        message = "hola esto es una prueba";
    }

    @Then("^se muestra el resultado de la información$")
    public void then() throws Throwable {
        Assert.assertEquals("hola esto es una prueba", message);
    }

}