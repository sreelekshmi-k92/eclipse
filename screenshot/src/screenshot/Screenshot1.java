package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");

driver.manage().window().maximize();
File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//File screen2=new File("C:\\Automation\screenshot\\2.jpeg");
FileUtils.copyFile(screen, new File("C:\\Automation\\screenshot\\3.jpeg") );
//FileUtils.copyFile(screen, screen2);
	}

}
