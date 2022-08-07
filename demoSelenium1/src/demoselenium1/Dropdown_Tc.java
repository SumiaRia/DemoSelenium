package demoselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Tc {

	public static void main(String[] args) {
	/*test case
	 * 
    1 Launch new browser
    2 Open URL https://itera-qa.azurewebsites.net/home/automation
    3 Select the "Norway" from for category "Where do you plan to travel this year?" (Use select method.)
    4 Close browser

	 * */
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
		dropdown.selectByVisibleText("Norway");
		
		
		
		
	}

}
