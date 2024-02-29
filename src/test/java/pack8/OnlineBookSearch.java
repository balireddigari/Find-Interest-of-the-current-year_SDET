package pack8;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/** @author 2308938
 * 
 *  OnlineBookSearch
 *
 **/

public class OnlineBookSearch {
	public static String SEARCH_KEY="Selenium Webdriver";
	public static String SORT_STRING="Price - Low to High";

	public static void main(String[] args) {
		//set the system property for chrome driver 
		
		
		WebDriverManager.chromedriver().setup();
		//create Chrome WebDriver Instance
		WebDriver driver=new ChromeDriver();
		
	try {
		//Launch Browser
		driver.get("https://www.bookswagon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputbar")).sendKeys(SEARCH_KEY);
		driver.findElement(By.id("btnTopSearch")).click();
		
		
		WebElement resultCount =driver.findElement(By.cssSelector("div.preferences-show>b"));
		int numberOfBooks = Integer.parseInt(resultCount.getText());
		if(numberOfBooks>10)
		{
			System.out.println("Number of search results is greater than 10");
		}else 
		{
			System.out.println("Number of search results is not greater than 10");
		}

		WebElement sort=driver.findElement(By.id("ddlSort"));
		
		sort.sendKeys(SORT_STRING);
		
		
		//driver.navigate().refresh();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSort")));
		sort=driver.findElement(By.id("ddlSort"));
		
		Select sortPrice=new Select(sort);
		
		sortPrice.selectByVisibleText(SORT_STRING);
		
		List<WebElement> bookTitles = driver.findElements(By.cssSelector("div.title > a"));
		List<WebElement> bookPrices = driver.findElements(By.cssSelector("div.sell"));
		for (int i = 0; i < 5; i++) {
			String bookTitle = bookTitles.get(i).getText();
            String bookPrice = bookPrices.get(i).getText();
            System.out.println("Book" +(i+1)+" : "+bookTitle + " - " + bookPrice);
        }
    }catch(Exception e) {
    	e.printStackTrace();
    }
	finally {
    	driver.quit();
    }
}
}

		

	
