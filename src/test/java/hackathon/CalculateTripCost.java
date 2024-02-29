package hackathon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculateTripCost {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".jd_modal_close.jdicon")).click();
		
		//driver.findElement(By.xpath("//span[@aria-label=\"May be later\"]")).click();
		
		//Thread.sleep(5000);
		WebElement selectLocation = driver.findElement(By.cssSelector(".input_location_box >input"));
		selectLocation.click();
		
		driver.findElement(By.xpath("//div[@class=\"location_text font14 fw400 color007\"]")).click();
		Thread.sleep(50000);
		//WebElement s=driver.findElement(By.xpath("//*[@id=\\\"react-autowhatever-city-auto-suggest--item-1\\\"]/a"));
		//s.click();
		//s.sendKeys("DLF Cyber City, Hyderabad");
		
		//driver.findElement(By.id("#react-autowhatever-city-auto-suggest--item-1"));
		//driver.findElement(By.xpath("//*[@id=\"react-autowhatever-city-auto-suggest--item-1\"]/a")).click();
		
		WebElement s=driver.findElement(By.xpath("//input[@id='main-auto']"));
		s.sendKeys(" Car Washing Services");
		//s.click();
		//driver.findElement(By.xpath("//div[@class=\"jdicon search_white_icon\"]")).click();
		WebElement button = driver.findElement (By.xpath("//div[@aria-label=\"search\"]"));
		button.sendKeys (Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-main-auto-suggest--item-0\"]/a/div[2]"));
	
		
		
	

		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		//Alert alertWindow=wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(alertWindow.getText());
		//alertWindow.accept();
		
		//driver.findElement(By.xpath("//input[@value=\" Car Washing Services\"]"));
		//Alert alertWindow=mywait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(alertWindow.getText());
		//alertWindow.dismiss();
		
	}

}
