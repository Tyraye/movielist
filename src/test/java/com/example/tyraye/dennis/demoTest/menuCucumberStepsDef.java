package com.example.tyraye.dennis.demoTest;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class menuCucumberStepsDef {
    String deez = "deez";

    @Given("I have selected a film")
    public void i_have_selected_a_film() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The film is not in English")
    public void the_film_is_not_in_english() {
        deez = "deez";
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I expect to see that it is not available in English")
    public void i_expect_to_see_that_it_is_not_available_in_english() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
