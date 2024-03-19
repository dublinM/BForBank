package com.mybank;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class IndividualStepdefs {

    private Individual individual;


    @Given("I have an individual named {string}")
    public void iHaveAnIndividualNamedName(String name) {
        individual = new Individual(name);
    }


    @Given("I have an individual named {string} with age {int}")
    public void iHaveAnIndividualNamedNameWithAgeAge(String name, int age) {
        individual = new Individual(name, age);

    }

    @Then("the name should be {string}")
    public void theNameShouldBeName(String name) {
        assertEquals(name,individual.getName());
    }

    @And("the age should be {int}")
    public void theAgeShouldBe(int age) {
        assertEquals(age, individual.getAge());
    }


    @When("I update the name to {string}")
    public void iUpdateTheNameToNewName(String newName) {
        individual.setName(newName);
    }

    @Then("the name should be renamed with the {string}")
    public void theNameShouldBeRenamedWithTheNewName(String newName) {
        assertEquals(newName, individual.getName());
    }
}
