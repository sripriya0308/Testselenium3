package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sripriya\\Documents\\Selenium\\Selenium Project\\EquifaxProject\\src\\main\\java\\Features",
		glue= {"stepdefinition"},
		format= {"pretty","html:test-output"}
		)	
		

public class RunnerTest {
	
	
	
	
	

}
 