package selenium1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEdge{
public static void main(String[] args) {

//Setting system properties of EdgeDriver
System.setProperty("webdriver.edge.driver", "C:\\Users\\msedgedriver.exe");

//Set the driver path;

//Start Edge Session
WebDriver driver = new EdgeDriver();

driver.get("https://www.cnn.com");

//Creating an object of EdgeDriver
driver.manage().window().maximize();

//Deleting all the cookies
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(500));

//
////Specifying pageLoadTimeout and Implicit wait
//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MILLISECONDS);
////driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
////launching the specified URL


//Locating the elements using name locator for the text box
//driver.findElement(By.name("q")).sendKeys("BrowserStack Guide");
//
//// locator for Google search button
//WebElement searchIcon = driver.findElement(By.name("btnK"));
//searchIcon.click();
driver.close();
}
}