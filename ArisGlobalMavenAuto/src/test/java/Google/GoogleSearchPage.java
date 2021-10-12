package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage
{
 public WebDriver MyDriver;
 
 public GoogleSearchPage(WebDriver MyDriver)
 {
  super();
  this.MyDriver = MyDriver;
 }
 
 By GSearchResult = By.id("result-stats");
 
 
  public WebElement ResultStatus()
 {
   return MyDriver.findElement(GSearchResult);
 }
 
}