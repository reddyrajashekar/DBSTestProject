package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flight_Pages {
   public WebDriver driver;
/*

    @FindBy(xpath = "//input[@id=\'source\']")
    public static WebElement Source;

    @FindBy(xpath = "//span[contains(text(),'Hyderabad,Hyderabad')]")
    public static WebElement From;

    @FindBy(xpath = "//span[contains(text(),'Bangalore')]")
    public static WebElement To;

    @FindBy(xpath = "input[@id='destination']")
    public static WebElement destination;

    @FindBy(xpath = "//div[@id='search-flight-btn']")
    public static WebElement SearchFlightBtn;

    @FindBy(className = "calendar-icon")
   public static WebElement CalenderIcon;

    @FindBy(id = "departure")
    public static WebElement departure;

    @FindBy(xpath = "//div[@class='container']//div[3]//div[2]//div[3]//div[7]")
    public static WebElement SelectDate;

*/

    @FindBy(xpath = "//input[@id='FromTag']")
    public static WebElement Source;

    @FindBy(xpath = "//span[contains(text(),'Hyderabad,Hyderabad')]")
    public static WebElement From;

    @FindBy(xpath = "//span[contains(text(),'Bangalore')]")
    public static WebElement To;

    @FindBy(xpath = "//input[@id='ToTag']")
    public static WebElement destination;

    @FindBy(xpath = "//input[@id='SearchBtn']")
    public static WebElement SearchFlightBtn;

    @FindBy(className = "calendar-icon")
    public static WebElement CalenderIcon;

    @FindBy(xpath = "//input[@id='DepartDate']")
    public static WebElement departure;

    @FindBy(xpath = "//a[contains(@class,'ui-state-default ui-state-active')]")
    public static WebElement SelectDate;

    @FindBy(xpath = "//div[@class='closeit']")
    public static WebElement ClosePopUp;


    public Flight_Pages(WebDriver driver) {
       this.driver=driver;
       //PageFactory.initElements(driver,this);
    }
}
