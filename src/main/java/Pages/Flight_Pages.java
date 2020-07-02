package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_Pages {
   static WebDriver driver;

    @FindBy(xpath = "//input[@id=\'source\']")
    public static WebElement From;

    @FindBy(xpath = "//input[@id='destination']")
   public static WebElement To;

    @FindBy(xpath = "//div[@id='search-flight-btn']")
    public static WebElement SearchFlightBtn;

    @FindBy(xpath = "//input[@id='departure']")
   public static WebElement DepartureDate;

    public Flight_Pages(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }
}
