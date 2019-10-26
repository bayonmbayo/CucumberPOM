package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/bayon/eclipse-workspace/CucumberPOM/src/main/java/com/qa/fearures/orangehrm.feature", //the path of features files 
				 glue="com/qa/stepdefinitions", // the path  of stepdefinitions files
				 plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
				 dryRun = false, // check the mapping is proper between feature file and stepdefinition file
				 monochrome = true, // display the console output in a proper readable format
				 strict = true //check if any stepdefinition is not defined in stepdefinition file
				 )
public class TestRunner {
	
}
