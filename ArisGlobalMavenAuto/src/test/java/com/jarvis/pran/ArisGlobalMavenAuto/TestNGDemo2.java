package com.jarvis.pran.ArisGlobalMavenAuto;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	public WebDriver myD;
	
	@Test
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		
		
	}
	
	@Test (dependsOnMethods = {"OpenApp"}, enabled = true)
	public void CloseApp()
	{
		myD.close();
	}
	
	
	
	
	
	

}
