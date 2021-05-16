package com.aplication.covsin.cucumber.ErrorTest;

import com.aplication.covsin.app.ui.menu.MenuActivity;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class ErrorTest {

    String message;

    @Given("^Una página que avise al usuario que algo va mal$")
    public void given() throws Throwable {
        System.out.println("La aplicacion da un error.");
    }

    @When("^Cuando suceda un error$")
    public void when() throws Throwable {
        message = MenuActivity.errorMessage();
    }

    @Then("^Se notificará al usuario que ha habido un error$")
    public void then() throws Throwable {
        Assert.assertEquals("Ha ocurrido un error", message);
    }

}