package com.mybank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.mybank")
public class MyStepdefs {
    private BankAccount account;

    @Given("the account has a balance of {double}")
    public void the_account_has_a_balance_of(Double balance) {
        account = new BankAccount(balance);
    }

    @When("the account holder checks if the account is overdrawn")
    public void theAccountHolderChecksIfTheAccountIsOverdrawn() {
        account.isOverdrawn();
    }

    @Then("the account should be overdrawn")
    public void theAccountShouldBeOverdrawn() {
        assertTrue(account.isOverdrawn());
    }


}
