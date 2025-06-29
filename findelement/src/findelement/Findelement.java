package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Automation\\selenium\\chrome-win64\\chrome.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("email")).sendKeys("sreelekshmik2012@gmail.com");	
driver.findElement(By.id("pass")).sendKeys("Sree@1993");
driver.findElement(By.name("login")).click();
	}

}
