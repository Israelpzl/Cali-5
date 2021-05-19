package com.aplication.covsin.cucumber.VacunacionTest;

import com.aplication.covsin.app.ui.menu.MenuActivity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class VacunacionTest {

    String message;

    @Given("^una página web del ministerio con toda la información de la vacunación$")
    public void given() throws Throwable {
        System.out.println("El usuario pulsa el boton de vacunacion.");
    }

    @When("^cuando se pulsa el botón \"([^\"]*)\"$")
    public void when(String strArg1) throws Throwable {
        message = MenuActivity.vacMessage();
    }

    @Then("^se muestra una notificación al usuario$")
    public void then() throws Throwable {
        Assert.assertEquals("Has pulsado el boton", message);
    }

}