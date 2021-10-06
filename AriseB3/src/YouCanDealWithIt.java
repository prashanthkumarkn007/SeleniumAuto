import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouCanDealWithIt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\CromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver MyDriver = new ChromeDriver(); MyDriver.manage().window().maximize();
		MyDriver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		MyDriver.findElement(By.id("food")).sendKeys("12");
		Thread.sleep(2000);
		MyDriver.findElement(By.id("clothing")).sendKeys("18");
		Thread.sleep(2000);
		MyDriver.findElement(By.id("shelter")).sendKeys("25");
		Thread.sleep(2000);
		MyDriver.findElement(By.id("monthlyPay")).sendKeys("100");
		Thread.sleep(2000);
		MyDriver.findElement(By.id("monthlyOther")).sendKeys("15");
		Thread.sleep(2000);
		String TotalMonthlyIncome = MyDriver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		String TotalMonthlyExpense = MyDriver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Total Monthly Income: " + TotalMonthlyIncome);
		System.out.println("Total Monthly Expense: " + TotalMonthlyExpense);
		MyDriver.close();
	}

}
