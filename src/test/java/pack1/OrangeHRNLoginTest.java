package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*Test case
--------
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser
*/
public class OrangeHRNLoginTest {
    


	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","path of the ")
		 
		//1.Launch Browser
		//WebDriverManager.Chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//3.provide username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//4.provide password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//5.click on login
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button))
		//6.title
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//7.close browser
		driver.quit();
	 }
		
		
}

