package framehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.id("name")).sendKeys("Hiii");
Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.id("frm1")));
Select course=new Select(driver.findElement(By.id("course")));
course.selectByVisibleText("Python");
Thread.sleep(3000);
driver.close();
	}

}
