package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features", 
glue={"com.stepDefinition"},
monochrome=true,
plugin= {"pretty", "html:reports/cucumber-html", "json:reports/cucumber.json"},
dryRun = false,
tags= "not @SmokeTest"
)
public class Runner {
	
	
}
