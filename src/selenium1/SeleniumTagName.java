package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTagName {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	// WebDriver driver = new FirefoxDriver();
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}
}
