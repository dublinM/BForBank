package com.mybank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.mybank")
public class BankAccountStepdefs {
    private BankAccount account;
    private Individual owner;

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

    @Then("the account should not be overdrawn")
    public void theAccountShouldNotBeOverdrawn() {
        assertFalse(account.isOverdrawn());
    }

    @Given("the account has an owner whose name is {string} and has an age of {int}")
    public void the_account_has_an_owner_whose_name_is_given_and_has_an_age_of(String name, int age) {
        owner = new Individual(name, age);
        account = new BankAccount(200, owner);
    }

    @When("the bank checks if the owner is major")
    public void theBankChecksIfTheOwnerIsMajor() {
        account.isOwnerMajor();
    }

    @Then("the owner should be major")
    public void theOwnerShouldBeMajor() {
        assertTrue(account.isOwnerMajor());
    }

    @Then("the owner should not be major")
    public void theOwnerShouldNotBeMajor() {
        assertFalse(account.isOwnerMajor());
    }

    @Given("the account of an owner who has {double} in his bank account")
    public void theAccountOfAnOwnerWhoHasBalanceInHisBankAccount(double balance) {
        account = new BankAccount(balance);
    }

    @When("the bank debit his account for an amount of {double}")
    public void theBankDebitHisAccountForAnAmountOfAmount(double amount) {
        account.debit(amount);
    }

    @Then("the account should have less money in his bank account")
    public void theAccountShouldHaveLessMoneyInHisBankAccount() {
        assertEquals(1900,account.getBalance(), 0.01);
    }

    @Given("the owner of the account has an initial {double}")
    public void theOwnerOfTheAccountHasAnInitialBalance(double balance) {
        account = new BankAccount(balance);
    }

    @When("he receives his salary the bank credit his account with a certain {double}")
    public void heReceivesHisSalaryTheBankCreditHisAccountWithACertainAmount(double amount) {
        account.credit(amount);
    }

    @Then("the account should have more money in his bank account")
    public void theAccountShouldHaveMoreMoneyInHisBankAccount() {
        assertEquals(2510, account.getBalance(), 0.01);
    }
}
