package windowhandling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.linkText("Help")).click();
Thread.sleep(3000);
Set<String> window=driver.getWindowHandles();
Iterator<String> itr=window.iterator();
while(itr.hasNext())
{
	String first=itr.next();
	String second=itr.next();
	driver.switchTo().window(first);
	driver.findElement(By.name("firstName")).sendKeys("Sreelekshmi");
	Thread.sleep(3000);
	driver.switchTo().window(second);
	Thread.sleep(3000);
	driver.findElement(By.linkText("Community")).click();
	driver.close();
	/*Thread.sleep(3000);
	driver.switchTo().window(first);
	driver.findElement(By.name("lastName")).sendKeys("K");*/
}
	}

}
