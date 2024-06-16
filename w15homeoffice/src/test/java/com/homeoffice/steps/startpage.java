package com.homeoffice.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class startpage {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
    }

    @When("^I click startNow Button$")
    public void iClickStartNowButton() {
    }

    @And("^I select Nationality \"([^\"]*)\"$")
    public void iSelectNationality(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click next step Button$")
    public void iClickNextStepButton() {
    }

    @And("^I get result message$")
    public void iGetResultMessage() {
    }

    @And("^I select reason for visit \"([^\"]*)\"$")
    public void iSelectReasonForVisit(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
