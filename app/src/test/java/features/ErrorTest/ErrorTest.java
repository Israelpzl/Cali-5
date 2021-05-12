package features.ErrorTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ErrorTest {


    @Given("^Una página que avise al usuario que algo va mal$")
    public void una_pgina_que_avise_al_usuario_que_algo_va_mal() throws Throwable {
        System.out.println("Hola");
      //  throw new PendingException();
    }

    @When("^Cuando suceda un error$")
    public void cuando_suceda_un_error() throws Throwable {
        System.out.println("Hola");
      //  throw new PendingException();
    }

    @Then("^Se notificará al usuario que ha habido un error$")
    public void se_notificar_al_usuario_que_ha_habido_un_error() throws Throwable {
        System.out.println("Hola");
      //  throw new PendingException();
    }

}