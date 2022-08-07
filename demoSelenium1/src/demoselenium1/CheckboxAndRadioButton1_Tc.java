package demoselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxAndRadioButton1_Tc {

	public static void main(String[] args) {
	/*test case
 	1 Launch new browser
    2 Open URL https://itera-qa.azurewebsites.net/home/automation
    3 Select the Radio button (2 years) for category Years of experience in test automation (Find elements by using Xpath method.)
    4 Check the Check Box ‘Selenium Webdriver’ and TestNG for category ‘Which automation tools/frameworks do you use?'(Find elements by using Xpath method)
    5 Close browser
*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[normalize-space()='2 years']")).click();
		List<WebElement> checkbox=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		for(WebElement check :checkbox) {
			String ck = check.getText();
			if(ck.equals("Selenium Webdriver")||ck.equals("TestNG")) {
				check.click();
			}
		}

	}

}
