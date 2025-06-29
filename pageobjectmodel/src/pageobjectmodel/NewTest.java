package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com/");
	  LoginPage l=new LoginPage(driver);
	  l.username();
	  l.password();
	  l.login();
  }
}
