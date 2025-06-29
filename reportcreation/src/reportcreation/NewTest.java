package reportcreation;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	ExtentHtmlReporter htmlreport;
	ExtentReports extreports;
	ExtentTest test;
  @Test
  public void f() {
	  test=extreports.createTest("facebooklogin");
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("sreek");
	  driver.findElement(By.id("pass")).sendKeys("abc");
	  driver.findElement(By.name("login")).click();
	  Assert.assertTrue(driver.getTitle().contentEquals("facebook"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if(result.getStatus()==ITestResult.SUCCESS)
	  {
		  test.log(Status.PASS, "pass");
	  }
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(Status.FAIL, "fail"+result.getThrowable());
	  }
	  if(result.getStatus()==ITestResult.SKIP)
	  {
		  test.log(Status.SKIP, "skip"+result.getThrowable());
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  htmlreport=new ExtentHtmlReporter("C:\\Automation\\selenium\\Report\\facebook.html");
	  htmlreport.config().setDocumentTitle("Automation Testing");
	  htmlreport.config().setReportName("Facebook Testing");
	  htmlreport.config().setTheme(Theme.DARK);
	  extreports=new ExtentReports();
	  extreports.attachReporter(htmlreport);
	  extreports.setSystemInfo("location", "locationhost");
	  extreports.setSystemInfo("platform", "windows");
	  extreports.setSystemInfo("browser", "chrome");
	  extreports.setSystemInfo("tester", "Sreelekshmi");
  }

  @AfterTest
  public void afterTest() {
	  extreports.flush();
  }

}
