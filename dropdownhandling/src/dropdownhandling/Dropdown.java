package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
Select day=new Select(driver.findElement(By.name("birthday_day")));
Select month=new Select(driver.findElement(By.name("birthday_month")));
Select year=new Select(driver.findElement(By.name("birthday_year")));
day.selectByValue("2");
month.selectByIndex(10);
year.selectByVisibleText("1992");
//month.selectByVisibleText("Mar");
//year.selectByValue("1990");
	}

}
