package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage
{
 public WebDriver MyDriver;
 
 public GoogleHomePage(WebDriver MyDriver)
 {
  super();
  this.MyDriver = MyDriver;
 }
 
 By GSearchTextBox = By.name("q");
 By GSearchButton = By.name("btnK");
 
 public WebElement SearchTextBox()
 {
   return MyDriver.findElement(GSearchTextBox);
 }
 
  public WebElement SearchButton()
 {
   return MyDriver.findElement(GSearchButton);
 }
 
}