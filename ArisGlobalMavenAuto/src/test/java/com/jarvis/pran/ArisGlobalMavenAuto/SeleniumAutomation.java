package com.jarvis.pran.ArisGlobalMavenAuto;

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

public class SeleniumAutomation {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
//		String LoginPage="Login";
//		String ForgotPasswordPage = "Reset";
//		String JoinNow="Sign Up";
//		String vTitle;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver MyDriver = new ChromeDriver();
		/*
		 * MyDriver.get("https://www.linkedin.com/login");
		 * 
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 * MyDriver.findElement(By.id("username")).sendKeys("Pran");
		 * MyDriver.findElement(By.id("password")).sendKeys("1234"); Thread.sleep(3000);
		 * MyDriver.findElement(By.
		 * xpath("//*[@id='password-visibility-toggle' and @class='button_password-visibility']"
		 * )).click(); MyDriver.findElement(By.partialLinkText("Forgot")).click();
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 * MyDriver.findElement(By.id("username")).sendKeys("prashanthjain007@gmail.com"
		 * ); MyDriver.findElement(By.linkText("Join now")).click();
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 */

		/*
		 * MyDriver.get("https://www.linkedin.com/login");
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 * MyDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("PRAN");
		 * MyDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		 * MyDriver.findElement(By.
		 * xpath("//*[@id='password-visibility-toggle' and @class='button__password-visibility']"
		 * )).click(); Thread.sleep(3000);
		 * 
		 * MyDriver.findElement(By.partialLinkText("Forgot")).click();
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 * MyDriver.findElement(By.id("username")).sendKeys("prashanthjain007@gmail.com"
		 * ); MyDriver.findElement(By.linkText("Join now")).click();
		 * System.out.println("It has navigated to "+MyDriver.getTitle());
		 * 
		 * MyDriver.get("https://www.amazon.in/");
		 * MyDriver.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).
		 * click(); Thread.sleep(3000);
		 */

//		 MyDriver.get("https://www.google.co.in/");
//		 String SearchTerm = "SELENIUM";
//		 Thread.sleep(3000);
//		 MyDriver.findElement(By.name("q")).sendKeys(SearchTerm);
//		 Thread.sleep(3000);
//		 int vSize = MyDriver.findElements(By.xpath("//input[@type='submit']")).size();
//		 System.out.println(vSize);
//		 MyDriver.findElement(By.name("btnK")).click();
//		 String SearchResult;
//		 SearchResult = MyDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).getText();
//		 
//		 if(SearchResult.equalsIgnoreCase(SearchTerm))
//		 {
//			 System.out.println("Test Case Pass");
//		 }
//		 else
//		 {
//			 System.out.println("Test Case Fail");
//		 }
//		 String SearchResuls = MyDriver.findElement(By.id("result-stats")).getText();
//		 System.out.println(SearchResuls);

		/* Getting Links using For Loop */
//		MyDriver.get("https://www.google.co.in/");
//		int aTagSize = MyDriver.findElements(By.tagName("a")).size();
//		System.out.println(aTagSize);
//		for (int i = 0; i < aTagSize; i++) {
//			String aLink = MyDriver.findElements(By.tagName("a")).get(i).getAttribute("href");
//			System.out.println(aLink);
//			String aLinkText = MyDriver.findElements(By.tagName("a")).get(i).getText();
//			System.out.println(aLinkText);
//			if (aLinkText.equals("Sign in")) {
//				MyDriver.get(aLink);
//			}
//		}

// Select Operation [selecting values in Drop Down[]		
		/*
		 * MyDriver.manage().window().maximize();
		 * MyDriver.get("https://www.amazon.in/");
		 * 
		 * Thread.sleep(2000); Actions navAction=new Actions(MyDriver);
		 * navAction.moveToElement(MyDriver.findElement(By.className(
		 * "nav-line-1-container"))).build().perform(); Thread.sleep(3000);
		 * MyDriver.findElement(By.className("nav-action-inner")).click();
		 * Thread.sleep(2000);
		 * 
		 * MyDriver.manage().window().maximize();
		 * MyDriver.get("https://www.mortgagecalculator.org/"); Thread.sleep(3000);
		 * System.out.println("It has navigated to : " + MyDriver.getTitle()); Select
		 * select = new Select(MyDriver.findElement(By.name("param[start_month]")));
		 * select.selectByIndex(4); Thread.sleep(3000); select.selectByValue("8");
		 * Thread.sleep(3000); select.selectByVisibleText("Dec"); Thread.sleep(3000);
		 */

//Browser Window Handles
		/*
		 * MyDriver.manage().window().maximize(); MyDriver.get(
		 * "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
		 * ); Thread.sleep(3000);
		 * MyDriver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).
		 * click(); Set<String> GID = MyDriver.getWindowHandles();
		 * System.out.println(GID); Iterator <String> GIT = GID.iterator(); String
		 * WindowParent = GIT.next(); String WindowChild = GIT.next();
		 * MyDriver.switchTo().window(WindowChild); String PageTitle =
		 * MyDriver.getTitle(); System.out.println(PageTitle);
		 * MyDriver.switchTo().window(WindowChild).close();
		 * MyDriver.switchTo().window(WindowParent).close(); MyDriver.quit();
		 */

		/*
		 * // Load the website MyDriver.get("http://www.naukri.com/");
		 * 
		 * // It will return the parent window name as a String String parent =
		 * MyDriver.getWindowHandle(); Set<String> s = MyDriver.getWindowHandles();
		 * 
		 * // Now iterate using Iterator Iterator<String> I1 = s.iterator();
		 * 
		 * while (I1.hasNext()) { String child_window = I1.next();
		 * 
		 * if (!parent.equals(child_window)) { MyDriver.switchTo().window(child_window);
		 * 
		 * System.out.println(MyDriver.switchTo().window(child_window).getTitle());
		 * Thread.sleep(5000); MyDriver.close(); }
		 * 
		 * } // switch to the parent window MyDriver.switchTo().window(parent);
		 * Thread.sleep(5000); MyDriver.close();
		 */

// Handle JavaScript ALert Window	

		/*
		 * MyDriver.manage().window().maximize(); MyDriver.get(
		 * "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		 * Thread.sleep(3000);
		 * MyDriver.findElement(By.xpath("//button[text()='Click me!']")).click();
		 * System.out.println(MyDriver.switchTo().alert().getText());
		 * Thread.sleep(3000); MyDriver.switchTo().alert().accept(); Thread.sleep(3000);
		 * 
		 * MyDriver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		 * System.out.println(MyDriver.switchTo().alert().getText());
		 * Thread.sleep(3000); MyDriver.switchTo().alert().dismiss();
		 * Thread.sleep(3000);
		 * 
		 * MyDriver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).
		 * click(); System.out.println(MyDriver.switchTo().alert().getText());
		 * Thread.sleep(1000); MyDriver.switchTo().alert().sendKeys("Kumar");
		 * Thread.sleep(4000); MyDriver.switchTo().alert().accept();
		 * 
		 * Thread.sleep(6000);
		 * 
		 * MyDriver.close();
		 */

// Handle Frames		
		/*
		 * MyDriver.manage().window().maximize();
		 * MyDriver.get("https://jqueryui.com/droppable/"); Thread.sleep(3000); String
		 * vText = MyDriver.findElement(By.className("entry-title")).getText();
		 * System.out.println(vText);
		 * 
		 * MyDriver.switchTo().frame(MyDriver.findElement(By.xpath(
		 * "//iframe[@class='demo-frame']"))); // - Identify Frmae // with Specific //
		 * attribute
		 *///		MyDriver.switchTo().frame("name / ID");

		/*
		 * vText = MyDriver.findElement(By.id("draggable")).getText();
		 * System.out.println(vText); WebElement source =
		 * MyDriver.findElement(By.id("draggable")); WebElement dest =
		 * MyDriver.findElement(By.id("droppable"));
		 * 
		 * Actions act = new Actions(MyDriver); act.dragAndDrop(source,
		 * dest).build().perform();
		 * 
		 * MyDriver.switchTo().defaultContent(); vText =
		 * MyDriver.findElement(By.className("entry-title")).getText();
		 * System.out.println(vText); Thread.sleep(4000); MyDriver.close();
		 */
		
// Implicit and Explicit Wait
		
		MyDriver.manage().window().maximize();
		MyDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(MyDriver, 20);
		MyDriver.get("https://www.mortgagecalculator.org/");
		MyDriver.findElement(By.id("homeval")).sendKeys("5000");
		MyDriver.findElement(By.name("param[downpayment]")).sendKeys("300");
		MyDriver.findElement(By.name("param[downpayment_type]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("intrstsrate")));
		MyDriver.findElement(By.id("intrstsrate")).sendKeys("5.5");
		
		MyDriver.findElement(By.name("calculateWRONG")).click();

		MyDriver.close();
	}

}
