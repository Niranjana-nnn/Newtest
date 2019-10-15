package Test;

import java.io.File;
//import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {

	@Test
	
	public  void test() throws Exception
	
	 {
		WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			
		 driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("http://www.allstate.com");
		    driver.findElement(By.linkText("Contact Us")).click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sr=ts.getScreenshotAs(OutputType.FILE);
			Files.copy(sr, new File("C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\Screenshotdemo\\contact.png"));
				
			System.out.println("screenshots taken");
			driver.quit();
	  }
	
}
