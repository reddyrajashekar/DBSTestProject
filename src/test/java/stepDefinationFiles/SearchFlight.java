package stepDefinationFiles;

import Config.ReadProperties;
import Pages.Flight_Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SearchFlight {
    static WebDriver driver;
    public ReadProperties prop;
    //Flight_Pages flight_pages=PageFactory.initElements(driver,Flight_Pages.class);

    @Given("Launch Browser")
    public void launch_browser() throws IOException {
       // ReadProperties prop=new ReadProperties();
        String CurrentDirectory=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",CurrentDirectory+"\\chromedriver.exe");
        driver =new ChromeDriver();

    }

    @When("Launch flights homepage")
    public void launch_flights_homepage() {
try {
    driver.get("https://in.via.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
}catch (WebDriverException e){
    e.printStackTrace();
}
    }

    @When("I input source flight and destination flight")
    public void i_input_source_flight_and_destination_flight() {
        try {
            Flight_Pages.From.sendKeys("Hyderabad");
            Flight_Pages.To.sendKeys("Bangalore");

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @When("I Click on Seach button")
    public void i_click_on_seach_button() {
        Flight_Pages.DepartureDate.sendKeys("Wed, Jul 01 2020");
        Flight_Pages.SearchFlightBtn.click();
      }

    @Then("Search Results should displayed")
    public void search_results_should_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
