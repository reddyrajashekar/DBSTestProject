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
    driver.get("https://www.cleartrip.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
}catch (WebDriverException e){
    e.printStackTrace();
}
    }

    @When("I input source flight and destination flight")
    public void i_input_source_flight_and_destination_flight() {
        try {
            Flight_Pages flight_pages=PageFactory.initElements(driver,Flight_Pages.class);

            flight_pages.Source.sendKeys("Hyderabad");
           // flight_pages.From.click();
            flight_pages.destination.sendKeys("Bangalore");
          //  flight_pages.To.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @When("I Click on Search button")
    public void i_click_on_search_button()throws Exception {
        Flight_Pages flight_pages = PageFactory.initElements(driver, Flight_Pages.class);
        try {
            Thread.sleep(3000);
            flight_pages.departure.sendKeys("Thu, 30 Jul, 2020");
          //  flight_pages.CalenderIcon.click();
            flight_pages.SelectDate.click();
            Thread.sleep(3000);
            flight_pages.SearchFlightBtn.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @Then("Search Results should displayed")
    public void search_results_should_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
