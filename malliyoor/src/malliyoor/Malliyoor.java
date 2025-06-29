package malliyoor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Malliyoor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.initstore.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Select year= new Select(driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")));
		//year.selectByValue("2023");
		//Select year= new Select(driver.findElement(By.xpath("//*[@id=\"content1\"]/app-login/body/div/div/div/div/div/div/form/div[1]/select")));
		//year.selectByValue("2023");
		//Thread.sleep(3000);
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content1\"]/app-login/body/div/div/div/div/div/div/form/div[5]/a")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
		driver.close();
	}
	

}
