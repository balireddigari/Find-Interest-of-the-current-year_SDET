package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class cssSelectors {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//tag and id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		
		//tag and class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("MacBook");
		
		//tag & class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		
		
		
	}
}
