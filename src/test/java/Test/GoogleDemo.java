package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo {

	WebDriver driver;
	
	String ExpectedResult = "selenium - Google Search";
	
	  @Test

	  
	public void f () {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.titleContains(ExpectedResult));
		
		Assert.assertEquals(ExpectedResult,driver.getTitle());
		
						
							
		
	}
	 
	
	
}
