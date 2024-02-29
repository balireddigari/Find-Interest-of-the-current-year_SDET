package pack6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/Register");
	driver.manage().window().maximize();
	WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	System.out.println("The display status of logo is:"+logo.isDisplayed());
	
	
	WebElement register=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
	System.out.println("The display status of logo is:"+register.isDisplayed());
	
	System.out.println("the enabled status:"+register.isEnabled());
	
	WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	female_rd.click();
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	}

}