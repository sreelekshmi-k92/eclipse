package testngparam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewTest {
	@Parameters("search")
  @Test
  public void f(String search) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  WebElement search1=driver.findElement(By.name("q"));
		  search1.sendKeys(search);
		  search1.submit();
  }
}
