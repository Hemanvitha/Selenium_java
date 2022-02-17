package selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome

public class SeleniumGecko {


public static void main(String[] args) {
    // declaration and instantiation of objects/variables
	// System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new WebDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome

		WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
	
    String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";

    // launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);

    // get the actual value of the title
    actualTitle = driver.getTitle();

    /*
     * compare the 
* the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //close Fire fox
//    driver.close();
      driver.quit(); //the process starts the entire driver from beginning
   
}

}
