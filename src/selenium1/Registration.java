package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class Registration {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/login.html");
	      WebElement email = driver.findElement(By.id("email"));
	      WebElement password = driver.findElement(By.id("passwd"));
	      email.sendKeys("tom@hk.com");
	      password.sendKeys("Jerry");
	      System.out.println("Text Entered");
	      email.clear();
	      password.clear();
	      
	      //login button
	      WebElement submit = driver.findElement(By.id("SubmitLogin"));
	      
	      email.sendKeys("tom@hk.com");
	      password.sendKeys("Jerry");
	      
	      submit.click(); //to login the form
	      
	      driver.close();

}
}
