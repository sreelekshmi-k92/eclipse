package fileuploading;

import org.openqa.selenium.WebDriver;

public class UsingSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("wedriver.chrome.driver", "C:\\Automation\\selenium\\chromedriver_win32.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	}

}
