package com.jani.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features = "{C:\\Users\\Janibasha\\Desktop\\GuruSelenium\\PracticeCucumber\\Features\\login.feature}", 
		    // feature file location 
		    
		    glue= "com.jani.stepdefinition" 
		    // the package for where feature file steps implimented
		    
		  //  tags="@smoke", 
		    // to run specific test cases and groups 
		    
		 //   dryRun=false, 
		    // identify the not implimented steps in feature file
		    
		   // plugin="html:./Reports/myReports.html"  
		    // single report
		    
		 //   plugin={"html:./Reports/myReports.html","json:./Reports/myReports.json"} 
		    // multiple reports
		)
public class TestRunner {
// blank
}
