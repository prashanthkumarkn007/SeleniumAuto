package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	public WebDriver MyDriver;

	public AmazonHomePage(WebDriver MyDriver) {
		super();
		this.MyDriver = MyDriver;
	}

	By SearchProduct = By.id("twotabsearchtextbox");
	By SearchButton = By.id("nav-search-submit-button");

	public WebElement SearchProduct() {
		return MyDriver.findElement(SearchProduct);
	}

	public WebElement SearchButton() {
		return MyDriver.findElement(SearchButton);
	}

}