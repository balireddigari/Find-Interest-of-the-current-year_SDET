package pack11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//Alert alertWindow=driver.switchTo().alert();
		//alertWindow.accept();
		Alert alertWindow=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alertWindow.getText());
		alertWindow.dismiss();
		
	}

}
