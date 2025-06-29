package glabalsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Glabalsqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.globalsqa.com/samplepagetest/");
driver.findElement(By.name("file-553")).sendKeys("C:\\Users\\Ajayan\\Downloads\\BK1.jpg");
driver.findElement(By.name("g2599-name")).sendKeys("Sreelekshmi");
driver.findElement(By.name("g2599-email")).sendKeys("Sreelekshmi@gmail.com");
driver.findElement(By.name("g2599-website")).sendKeys("www.w3schools.com");
Select exp=new Select(driver.findElement(By.name("g2599-experienceinyears")));
exp.selectByIndex(2);
//driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[4]/input")).click();
//driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[3]/input")).click();
//driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/button")).click();
//driver.switchTo().alert().accept();
driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("aaabbbcccc");
driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button")).click();


	}

}
