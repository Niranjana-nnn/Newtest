package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcases {

	@Test
	
	public void test() 
	{
		
		WebDriver driver = BrowserFactory.stratBrowser()
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
}
