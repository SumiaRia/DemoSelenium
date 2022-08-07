package demoselenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Signup_Tc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ria\\eclipse\\java-2022-06\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("body > nav:nth-child(1) > div:nth-child(3) > form:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.id("FirstName")).sendKeys("md");
		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("sheikh");
		driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys("md@gmail.com");
		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("0948372845738");
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Mohammud12");
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("Mohammud");
		WebElement con_password= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		con_password.sendKeys("Mohammud");
		Thread.sleep(2000);
		if(password.equals(con_password)) {
			System.out.println("password match");
		}
		
		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

}
