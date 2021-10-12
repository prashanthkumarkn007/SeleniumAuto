package AmazonTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {

	public Properties properties;
	public FileInputStream fis;
	public String vBrowser;
	public WebDriver MyDriver;

	public void BrowserCall() throws IOException {
		properties = new Properties();
		fis = new FileInputStream("C:\\Eclipse IDE 2021_JUN\\Prashanth\\Automation\\ArisFrmaework\\data.properties");
		properties.load(fis);
		vBrowser = properties.getProperty("Browser");

		if (vBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
			MyDriver = new ChromeDriver();
		} else if (vBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\EdgeDriver\\edgedriver_win32\\msedgedriver.exe");
			MyDriver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser");
		}

	}

}
