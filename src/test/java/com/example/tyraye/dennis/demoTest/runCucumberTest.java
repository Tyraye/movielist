package com.example.tyraye.dennis.demoTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/rescources/Cucumber", glue = "com.example.tyraye.dennis.demoTest")


public class runCucumberTest {
}
