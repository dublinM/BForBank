package com.mybank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
//    @io.cucumber.java.en.Given("^the account has a balance of <balance>$")
//    public void theAccountHasABalanceOfBalance() {
//    }

    @Given("the account has a balance of {double}")
    public void the_account_has_a_balance_of(double balance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the {string} checks the {double}")
    public void the_checks_the(String string, double int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the balance should be {int}")
    public void the_balance_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
