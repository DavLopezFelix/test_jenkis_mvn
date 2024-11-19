package com.globant_test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.globant_test.stepDefinitions", "com.globant_test.hooks"},
        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        tags ="@smoketest"
)

public class TestRunner {
}
