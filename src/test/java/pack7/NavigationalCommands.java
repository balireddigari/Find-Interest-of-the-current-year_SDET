package pack7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		
		

	}

}
