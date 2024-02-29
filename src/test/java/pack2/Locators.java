package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.*;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php/");
		driver.manage().window().maximize();
		//id
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		//class
		driver.findElement(By.name("submit_search")).click();
		//linkText
		driver.findElement(By.linkText("Blouse")).click();
		//Partiallinktext
		//driver.findElement(By.partialLinkText("Faded")).click();
		//
	}

}
