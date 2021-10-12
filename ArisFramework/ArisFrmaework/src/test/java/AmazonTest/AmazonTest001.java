package AmazonTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonTest001 extends base {
	@Test
	public void TS001() throws IOException, InterruptedException {
		// Test Implementation Code HERE....
		BrowserCall();
		MyDriver.manage().window().maximize();
		MyDriver.get(properties.getProperty("URL"));
		MyDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		// Call Page Object Class - Home Page
		AmazonHomePage homepage = new AmazonHomePage(MyDriver);
		homepage.SearchProduct().sendKeys("Iphone 13 Pro");
		homepage.SearchButton().click();
		
		// Call Page Object Class - Result Page
		
		AmazonSearchPage searchpage = new AmazonSearchPage(MyDriver);
		Thread.sleep(3000);
		searchpage.GetItByTomorrow().click();
		Thread.sleep(3000);
		myprint(searchpage.ResultText().getText());
		
	}

	@AfterTest
	public void tearDown()
	{
		MyDriver.close();
	}
	
	public void myprint(String vText)
	{
		System.out.println(vText);
	}
}
