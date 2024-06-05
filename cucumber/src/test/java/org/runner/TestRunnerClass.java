package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.ReportingDoc;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,publish =true,snippets = SnippetType.CAMELCASE ,monochrome = true,stepNotifications = true,plugin = {"pretty","json:target/joutput.json"},features = {"src\\test\\resources\\Feature\\AmazonWithoutheader.feature"},glue = {"com.datatabel.amzon"})
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
			ReportingDoc.generateJvmReport(System.getProperty("user.dir")+"\\target");	
	}
	
	
	
	
	
	
}
