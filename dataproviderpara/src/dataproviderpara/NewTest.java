package dataproviderpara;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "facebooklogin")
  public void f(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("pass")).sendKeys(password);
	  driver.findElement(By.name("login")).click();
  }

  @DataProvider(name="facebooklogin")
  public Object[][] getdata() throws IOException {
	  FileInputStream fis= new FileInputStream("C:\\Automation\\selenium\\Book1.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheet("Sheet1");
	  String[][] loginvalue= new String[3][2];
	  for(int i=0;i<3;i++)
	  {
		  loginvalue[i][0]=sh.getRow(i).getCell(0).getStringCellValue();
		  loginvalue[i][1]=sh.getRow(i).getCell(1).getStringCellValue();
		  
	  }
    return loginvalue; 
  }
}
