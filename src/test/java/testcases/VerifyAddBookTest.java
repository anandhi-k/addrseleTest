package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAddBookTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://35.238.13.157:32768/addressbook/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void addbookTest() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.xpath("//input[@type=\"text\" and @aria-labelledby=\"gwt-uid-4\"]")).sendKeys("Devops");
		driver.findElement(By.xpath("//input[@type=\"text\" and @aria-labelledby=\"gwt-uid-6\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type=\"text\" and @aria-labelledby=\"gwt-uid-8\"]")).sendKeys("234567890");
		driver.findElement(By.xpath("//input[@type=\"text\" and @aria-labelledby=\"gwt-uid-10\"]")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"text\" and @aria-describedby=\"gwt-uid-2\"]")).sendKeys("01/03/1991");
//		// driver.findElement(By.id("gwt-uid-17")).sendKeys("Devops");
//		driver.findElement(By.id("gwt-uid-19")).sendKeys("Selenium");
//		driver.findElement(By.id("gwt-uid-21")).sendKeys("877678909");
//		driver.findElement(By.id("gwt-uid-23")).sendKeys("devopsadmin@gmail.com");
//		driver.findElement(By.id("gwt-uid-14")).sendKeys("01/05/1991");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
