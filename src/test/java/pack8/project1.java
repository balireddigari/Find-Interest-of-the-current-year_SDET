package pack8;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class project1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under rs 30000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Validate the search the string
		String val=driver.getPageSource();
		System.out.println(val.contains("mobile smartphones under rs 30000"));
		//Validate the number of Pages(example:1-16)
		String ps=driver.getPageSource();
		System.out.println(ps.contains("1-16"));
		//Validate the number of Items
		String Items=driver.getPageSource();
		System.out.println(Items.contains("over 3,000"));
		List<WebElement> pages=driver.findElements(By.xpath("//span[contains(text(),'1-16')]"));
		System.out.println("The Number of Pages are:"+pages.size());
		List<WebElement> items=driver.findElements(By.className("s-image"));
		System.out.println("The Number of Items are:"+items.size());
		//click on the sort by list button
		driver.findElement(By.id("a-autoid-0-announce")).click();
		//counting the number of options
		List<WebElement> options=driver.findElements(By.className("a-dropdown-item"));
		System.out.println("The Number of Options are:"+options.size());
		// Selecting the Newest Arrivals option  in the dropdown and verify the option got selected or not
		for(WebElement option:options) {
			String text=option.getText();
		if(text.equals("Newest Arrivals")) {
			option.click();
			String exp=driver.findElement(By.cssSelector("span.a-dropdown-prompt")).getText();
			String act = "Newest Arrivals";
			if(act.equals(exp)) {
				System.out.println("option is selected");
			}
			else {
				System.out.println("option is not selected");
			}
		}
		}
	}}




