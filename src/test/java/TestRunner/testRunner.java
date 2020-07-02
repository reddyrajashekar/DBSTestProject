package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "features/FlightHome.feature",glue = "stepDefinationFiles")
public class testRunner {
WebDriver driver;
@Before
    public void setUp(){
    System.out.println("Starting test..");
}
@After
    public void closeBrowser(){
    driver.close();
    driver.quit();
}
}
