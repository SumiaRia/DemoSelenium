package demoselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textarea_Tc {

	public static void main(String[] args) {
	/*test case
	1.Launch new browser
    2.Open URL https://itera-qa.azurewebsites.net/home/automation
    3.Type Name, Mobile number, Email address, Password, Address (Use ID locator )
    4.Click on Submit button (Use Name locator)
    5.Close browser*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Shorna");
		driver.findElement(By.id("phone")).sendKeys("01643678");
		driver.findElement(By.id("email")).sendKeys("shor@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shorna");
		driver.findElement(By.id("address")).sendKeys("10/dhaka");
		driver.findElement(By.name("submit")).click();
		driver.close();
		

	}

}
