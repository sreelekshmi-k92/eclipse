package saaradhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Saaraddhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://crm.initstore.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Alwin");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/app-root/ion-app/app-login/body/div/div[2]/div[2]/div/div/form/div[4]/button")).click();
		//Actions action=new Actions(driver);
		//WebElement action1=driver.findElement(By.xpath("/html/body/app-root/ion-app/app-admin-home/body/div/div[2]/div/div/ul/li[5]/a/span[1]"));
		//action.moveToElement(action1).perform();
		//action1.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/app-root/ion-app/app-admin-home/body/div/div[1]/div[2]/div/form/input")));
		//driver.findElement(By.xpath("/html/body/app-root/ion-app/app-admin-home/body/div/div[1]/div[2]/div/form/input")).click();
		
	}

}

