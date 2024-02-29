package pack2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Locators2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php/");
		driver.manage().window().maximize();
		
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders:"+sliders.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Number of images:"+images.size());
		driver.quit();
		
		

	}

}
