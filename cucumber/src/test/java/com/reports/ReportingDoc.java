package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingDoc {

	public static void generateJvmReport(String jsonFile) {
		
		File file=new File(System.getProperty("user.dir")+"\\target");
		
		Configuration configuration=new Configuration(file, "adctinTestReport");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "104");
		configuration.addClassifications("Os", "Win 10");
		configuration.addClassifications("Sprint", "34");
		
		List<String> jsonFile1=new ArrayList<String>();
		jsonFile1.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonFile1, configuration);
		builder.generateReports();
	
	
	}
	
	
}
