package pom2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;		
	}
public void username()
{
	driver.findElement(By.id("email")).sendKeys("sree");
}
public void password()
{
	driver.findElement(By.id("pass")).sendKeys("123");
}
public void login()
{
	driver.findElement(By.name("login")).click();
}
}
