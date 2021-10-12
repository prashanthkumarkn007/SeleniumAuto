package com.jarvis.pran.ArisGlobalMavenAuto;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	
	public WebDriver myD;
	
	@Test
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.amazon.in");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
