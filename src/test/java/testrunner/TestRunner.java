package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		            features= {".//FeatureFiles/Feature1.feature"},
		        
		          //features={".//FeatureFiles/"},
		          //features= {".//FeatureFiles/DDTFile.feature",".//FeatureFiles/Feature1.feature"},
		         // features= {"@target/rerun.txt"},
                  glue="stepdefination" ,
                  plugin= {"pretty","html:reports/MyCucumberReport.html",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                		  //"rerun:target/rerun.txt",},
                  
                  dryRun=false,
                  monochrome=true,
                  publish=true
                  //tags="@regression"
                  
                  
                  )

public class TestRunner {
	
	

}