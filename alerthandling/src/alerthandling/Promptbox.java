package alerthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Promptbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver", "C:\\Automation\\selenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
//FirefoxOptions opt = new FirefoxOptions();
//WebDriver driver=new FirefoxDriver(opt);
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://echoecho.com/javascript4.htm");
driver.findElement(By.name("B3")).click();
System.out.println(driver.switchTo().alert().getText());
Thread.sleep(5000);
driver.switchTo().alert().sendKeys("Helloo");
Thread.sleep(5000);
driver.switchTo().alert().accept();
	}

}
