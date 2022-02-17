package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Twitter {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://twitter.com/i/flow/signup");
	
		 WebElement Name = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input"));
		 WebElement byName = driver.findElement(By.name("name"));
		 WebElement email = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[1]/div/div[3]/label"));
		
		 byName.sendKeys("Hemanvitha");
	     email.sendKeys("tom@hk.com");
		 Select select =new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[1]/div/div[5]/div[3]/div/div[1]")));
		 select.selectByIndex(4);
		 
		 select =new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[1]/div/div[5]/div[3]/div/div[2]")));
		 select.selectByIndex(18);
		 select =new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[1]/div/div[5]/div[3]/div/div[3]")));
		 
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div[2]/div"));
		 
		 
		 
		 submit.click();
		 driver.close();
}
}