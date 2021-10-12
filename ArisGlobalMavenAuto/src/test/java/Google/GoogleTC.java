package Google;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleTC {
	@Test
	public void TC001() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver MyDriver = new ChromeDriver();
		MyDriver.manage().window().maximize();
		MyDriver.get("https://www.google.com/");
		MyDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleHomePage GH = new GoogleHomePage(MyDriver);
		Thread.sleep(3000);
		GH.SearchTextBox().sendKeys("Aris Global");
		Thread.sleep(3000);
		GH.SearchButton().click();
		Thread.sleep(3000);
		GoogleSearchPage GP = new GoogleSearchPage(MyDriver);
		String vStat = GP.ResultStatus().getText();
		System.out.println(vStat);
		MyDriver.close();
		
	}
	
	
}