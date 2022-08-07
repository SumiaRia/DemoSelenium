package demoselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxAndRadioButton_Tc {

	public static void main(String[] args) {
		/*test case
    1 Launch new browser
    2 Open URL https://itera-qa.azurewebsites.net/home/automation
    3 Select the Gender(Use ID locator)
    4 Check the Check Box "Tuesday" and "Friday" for category ‘Which days of the week are best to start something new?'(Use ID locator)
    5 Close browser
		*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.id("female")).click();
//		driver.findElement(By.id("tuesday")).click();
//		driver.findElement(By.id("friday")).click();
		
		//anther way to check checkbox
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement check: checkbox) {
			String ck = check.getAttribute("id");
			if(ck.equalsIgnoreCase("Tuesday")||ck.equals("friday")) {
				check.click();
			}
		}
		driver.close();

	}

}
