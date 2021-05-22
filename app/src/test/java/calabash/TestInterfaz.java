package calabash;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class TestInterfaz {

    @Then("^acceder al menu$")
    public void acceder_al_menu() throws Throwable {
        throw new PendingException();
    }

    @Then("^pulsar el boton \"([^\"])\"$")
    public void pulsar_el_boton_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^pulsar el boton de \"([^\"])\"$")
    public void pulsar_el_boton_de_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^pulsar boton \"([^\"])\"$")
    public void pulsar_boton_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^introducir por teclado \"([^\"])\"$")
    public void introducir_por_teclado_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^abrir \"([^\"])\"$")
    public void abrir_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
}
