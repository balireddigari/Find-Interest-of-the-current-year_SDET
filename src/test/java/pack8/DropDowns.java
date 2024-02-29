package pack8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWe
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement dropA=driver.findElement(By.xpath("//select[@class='col-lg-3' and @id='animals']"));
		Select dropAnimal=new Select(dropA);
		
		dropAnimal.selectByVisibleText("Baby Cat");
		Thread.sleep(5000);
		dropAnimal.selectByIndex(2);
		
		List<WebElement> options=dropAnimal.getOptions();
		System.out.println("TH total options are:"+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		

	}

}
