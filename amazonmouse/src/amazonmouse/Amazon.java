package amazonmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		WebElement action1=driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		//WebElement action1=driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
		action.moveToElement(action1).perform();
		action1.click();
		//WebElement action2=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a"));
	    WebElement action2=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a"));
		action.moveToElement(action2).perform();
		action2.click();
		//  WebElement action3=driver.findElement(By.xpath("//*[@id=\"B0BK1457X3\"]/a[2]/span/div"));
			//action.moveToElement(action3).perform();
			//action3.click();
	}

}
