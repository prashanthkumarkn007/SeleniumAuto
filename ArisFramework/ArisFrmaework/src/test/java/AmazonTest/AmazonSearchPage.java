package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPage {
	public WebDriver MyDriver;

	public AmazonSearchPage(WebDriver MyDriver) {
		super();
		this.MyDriver = MyDriver;
	}

	By GetItByTomorrow = By.xpath("//*[@id=\"p_90/6741118031\"]/span/a");
	By ResultText = By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]");
	                         
	public WebElement GetItByTomorrow() {
		return MyDriver.findElement(GetItByTomorrow);
	}

	public WebElement ResultText() {
		return MyDriver.findElement(ResultText);
	}

}