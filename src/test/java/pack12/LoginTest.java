package pack12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import java.time.Duration;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void testLogo() 
	{
		LoginPagePOM lp = new LoginPagePOM(driver);
		AssertJUnit.assertEquals(lp.checkLogoPresence(),true);
	}
	@Test
	void testLogin() 
	{
		LoginPagePOM lp = null;
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit(null);
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterMethod
	@AfterClass
	void tearDown() {
		driver.close();
	}
	

}
