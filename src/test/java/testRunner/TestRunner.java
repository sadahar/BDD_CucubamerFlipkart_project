package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;


//@RunWith(Cucumber.class)

@CucumberOptions( 

		features = { ".//Feature/FeatureFileForLoginPage.feature",".//Feature/FbAsserationCheck.feature"} ,
		glue = "stepDefination", 
	  // tags = "@sanity",
	 // tags= "@regression",
      tags="@sanity and @ Regression" ,
   //   tags="@sanity and not @ Regression",
		dryRun = false,
		monochrome = true,
	//	plugin = { "pretty", "html:target/Reports/LoginFileAsserationReport_html.html" }

		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		
		
)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
