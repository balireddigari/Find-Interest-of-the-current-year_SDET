package hackathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JustDialP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
		

		driver.findElement(By.cssSelector("#city-auto-sug")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".input_location_box>input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".input_location_box>input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//input[@id='main-auto']"));
		s.sendKeys(" Car Washing Services");
		
		WebElement button = driver.findElement (By.xpath("//*[@id=\"__next\"]/div/section/header/div/div[2]/div/div[2]/label/div[3]/div"));
		button.click();
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"react-autowhatever-main-auto-suggest--item-0\"]/a/div[2]"));
		search.sendKeys(Keys.ENTER);
		
		
		
	}

}
