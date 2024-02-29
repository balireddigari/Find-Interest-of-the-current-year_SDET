package pack6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("The title of the page is:"+driver.getTitle());
		
		System.out.println("The current URL is:"+driver.getCurrentUrl());
		
		System.out.println("the page source is:"+driver.getPageSource());
		
		System.out.println("The window handle:"+driver.getWindowHandle());
		
		System.out.println("The window handle:"+driver.getWindowHandles());
		
		driver.findElement(By.linkText("OrangeHRM,Inc")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			System.out.println(winid);
		}
		
		

	}

}
