package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://output.jsbin.com/usidix/1";
		 driver.get(baseUrl);
		 driver.findElement(By.cssSelector("body > input[type=button]")).click();
		 String alertMsg = "";
		 alertMsg = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 System.out.println(alertMsg);
		 driver.close();
	}
	
}
