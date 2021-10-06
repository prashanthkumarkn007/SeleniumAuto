import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Browser {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("***Browser Menu***");
	    System.out.println("Chrome");
	    System.out.println("Edge");
	    System.out.println("Please enter the Browser Name");
	    String browser = myObj.nextLine();
	    System.out.println(browser);
	   
	   switch(browser) {
	    case "Chrome":
	    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver MyDriver = new ChromeDriver();
			MyDriver.get("https://www.google.com/");
			String vTitle = MyDriver.getTitle();
			System.out.println(vTitle);
			MyDriver.close();
	      break;
	    case "Edge":
	    	System.setProperty("webdriver.e.driver", "C:\\Selenium\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
			WebDriver EdgeDriver = new EdgeDriver();
			EdgeDriver.get("https://www.google.com/");
			String vTitleedge = EdgeDriver.getTitle();
			System.out.println(vTitleedge);
			EdgeDriver.close();
	      break;
	    default:
	    	System.out.println("Browser not available");
	  }
		

	}

}
