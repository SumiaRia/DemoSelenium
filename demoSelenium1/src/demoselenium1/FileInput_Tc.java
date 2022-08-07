package demoselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileInput_Tc {

	public static void main(String[] args) {
		/*test case
	 	1 Launch new browser
	    2 Open URL https://itera-qa.azurewebsites.net/home/automation
	    3 upload the file 
	    5 Close browser*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#inputGroupFile02")).sendKeys("C:\\Users\\ria\\Pictures\\ayat\\20211113_234438_0000.png");
		driver.findElement(By.cssSelector(".input-group-text")).click();
	}

}
