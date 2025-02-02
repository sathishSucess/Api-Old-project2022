package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@ChangeProfilePic"), snippets = SnippetType.CAMELCASE, stepNotifications = true, dryRun = true, features = {
		"src\\test\\resources\\Feature" }, glue = { "com.stepdefinition" })
public class TestRunner {

}
