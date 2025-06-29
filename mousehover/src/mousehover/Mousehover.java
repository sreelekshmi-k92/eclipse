package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Automation\\selenium\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Actions action=new Actions(driver);
WebElement action1=driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
action.moveToElement(action1).perform();
action1.click();
WebElement action2=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a"));
action.moveToElement(action2).perform();
action2.click();
	}

}
