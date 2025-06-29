package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

FileInputStream excel=new FileInputStream("C:\\Automation\\selenium\\Book1.xlsx");
XSSFWorkbook wv=new XSSFWorkbook(excel);
XSSFSheet sh=wv.getSheet("Sheet1");
for(int i=0;i<3;i++)
{
	driver.findElement(By.name("email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
	driver.findElement(By.name("pass")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
    driver.findElement(By.name("login")).click();
    Thread.sleep(3000);
    if(driver.getTitle().contentEquals("Facebook"))
    {
       System.out.println("login success");
       sh.getRow(i).createCell(2).setCellValue("pass");
    }
    else
    {
    	System.out.println("login failed");
    	sh.getRow(i).createCell(2).setCellValue("fail");
    }
    FileOutputStream result=new FileOutputStream("C:\\Automation\\selenium\\Book1.xlsx");
    wv.write(result);
    driver.get("https://www.facebook.com/");
}


	}

}
