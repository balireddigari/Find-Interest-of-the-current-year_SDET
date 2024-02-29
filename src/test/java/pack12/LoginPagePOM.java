package pack12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {

	WebDriver driver;
	
	//constructor
	LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By img_logo_img=By.xpath("//img[@alt='company-branding']");
	By text_username_loc=By.name("username");
	By text_password_loc=By.name("password");
	By btn_submit_loc=By.xpath("//button[@type=\"submit\"]");
	
	//Actions
	public void setUserName(String username)
	{
		driver.findElement(text_username_loc).sendKeys(username);
	}
	public void setPassword(String password)
	{
		driver.findElement(text_password_loc).sendKeys(password);
	}
	public void clickSubmit(String submit)
	{
		driver.findElement(btn_submit_loc).click();
	}
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(img_logo_img).isDisplayed();
		return status;
	}
}
	
	
