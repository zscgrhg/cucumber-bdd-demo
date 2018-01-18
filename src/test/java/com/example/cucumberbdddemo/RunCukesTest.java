package com.example.cucumberbdddemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:com/example/cucumberbdddemo/feature"},
        glue = {"com.example.cucumberbdddemo.feature", "cucumber.api.spring"},
        plugin = {"pretty",
                "json:target/cucumber/cucumber-report.json",
                "html:target/cucumber/cucumber-report.json"}
)
public class RunCukesTest {
}
