package com.jarvis.pran.ArisGlobalMavenAuto;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGDemo5_1 {
	
	public WebDriver myD;
	
	@Test(groups = {"R1"})
	@Parameters({"vURL"})
	public void OpenApp(String vURL)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get(vURL);
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
