package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Test {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\msedgedriver.exe");

		//Set the driver path;

		//Start Edge Session
		WebDriver driver2 = new EdgeDriver();
	      driver.get("https://demo.guru99.com/test/login.html");
	      driver2.get("https://demo.guru99.com/test/login.html");
	      WebElement email = driver.findElement(By.id("email"));
	      WebElement password = driver.findElement(By.id("passwd"));
	      email.sendKeys("tom@hk.com");
	      password.sendKeys("Jerry");
	      System.out.println("Text Entered");
	  
	      //login button
	      WebElement submit = driver.findElement(By.id("SubmitLogin"));
	      
	      email.sendKeys("tom@hk.com");
	      password.sendKeys("Jerry");
	      
	      submit.click(); //to login the form
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      driver2.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      String actualUrl="https://demo.guru99.com/test/success.html"; 
	      String expectedUrl= driver.getCurrentUrl(); 
	      
	      if (actualUrl.equals(expectedUrl))
	  	{
	  	System.out.println( "Test Passed") ;
	  	}
	  	else {
	  	System.out.println( "Test Failed" );
	  	}

	      driver.close();

}
}


