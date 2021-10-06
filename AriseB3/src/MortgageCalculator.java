import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MortgageCalculator {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver MyDriver = new ChromeDriver();
		MyDriver.get("https://www.mortgagecalculator.org/");
		
		MyDriver.findElement(By.id("homeval")).sendKeys("5000");
		MyDriver.findElement(By.name("param[downpayment]")).sendKeys("300");
		MyDriver.findElement(By.name("param[downpayment_type]")).click();
		MyDriver.findElement(By.id("intrstsrate")).sendKeys("5.5");
		MyDriver.findElement(By.name("cal")).click();
		String vMPay = MyDriver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[6]/div[1]/h3")).getText();
		System.out.println(vMPay);
		MyDriver.close();
		

	}

}
