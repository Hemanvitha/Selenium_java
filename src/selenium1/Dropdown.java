package selenium1;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdown {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://demoqa.com/select-menu";
		driver.get(baseURL);
//		Select select = new Select(driver.findElement(By.className("css-1hwfws3")));
    	
    	
        //Creating 
//Step#3- Selecting the dropdown element by locating its id
   
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        //Step#4- Printing the options of the dropdown
        //Get list of web elements
        List<WebElement> lst = select.getOptions();

        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());

//		System.out.println("Select the Option by Index 4");
        select.selectByIndex(4);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
        System.out.println("Select the Option by Text Magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Step#7- Selecting an option by its value
        System.out.println("Select the Option by value 6");
        select.selectByValue("6");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        driver.quit();
//		
//
//	}
//
//}
//Step#3- Selecting 

//Step#5- Selecting the option as 'Purple'-- selectByIndex
        
    }

}

