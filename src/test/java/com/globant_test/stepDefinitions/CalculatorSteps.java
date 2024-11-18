package com.globant_test.stepDefinitions;

import com.globant_test.pages.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.testng.Assert.*;

public class CalculatorSteps extends CalculatorPage {

    @Given("the calculator is open")
    public void theCalculatorIsOpen() {
    }

    @When("I press {string}")
    public void iPress(String key) {
        switch (key) {
            case "6":
                clickNumberSix();
                break;
            case "9":
                clickNumberNine();
                break;
            case "+":
                clickPlus();
                break;
            case "=":
                clickEquals();
                break;
        }
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expected) {
        String result = getResult();
        assertEquals(result, expected, "Expected result to be " + expected + ", but got " + result);
    }
}
