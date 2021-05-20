package com.aplication.covsin.cucumber.smokeTest;

import android.view.Menu;

import com.aplication.covsin.app.ui.login.LoginActivity;
import com.aplication.covsin.app.ui.menu.MenuActivity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginTest {
    String User;
    String password;

    @Given("^Patalla del login$")
    public void given() throws Throwable {
        System.out.println("El Usuario quiere logearse");
    }

    @When("^Te logeas en la aplicación$")
    public void when() throws Throwable {
        User = LoginActivity.userRandom();
        password = LoginActivity.PasswordUser(User);

    }

    @Then("^Cuando introduces un usuario$")
    public void then() throws Throwable {

        Assert.assertEquals("AntonioCuad", User);

        Assert.assertEquals("Cuad", password);

    }

}