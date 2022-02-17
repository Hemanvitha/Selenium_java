package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusData{
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/ajax.html");
	      // identify element
//	      WebElement l = driver.findElement(By.className("radiobutton"));
	      // href value from getAttribute()
	      List<WebElement> elements = driver.findElements(By.name("name"));
	      System.out.println("Number of elements:" +elements.size());

	      for (int i=0; i<elements.size();i++){
	        System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	        
	        }

	      driver.close();
	   }

	}
