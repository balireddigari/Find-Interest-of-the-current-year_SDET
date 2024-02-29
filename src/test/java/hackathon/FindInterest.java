package hackathon;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindInterest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Implicit wait of 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the website
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
     	driver.findElement(By.xpath("//a[text()='Car Loan']")).click();
     	
     	
     	//CAR LOAN
		WebElement loan_amount = driver.findElement(By.id("loanamount"));
		String val1 = loan_amount.getAttribute("value");
		if(val1!=null)
		{
			for(int i=0;i<val1.length();i++)
			{
				loan_amount.sendKeys(Keys.BACK_SPACE);
			}
		}
		loan_amount.sendKeys("1500000");
		
		
	
		WebElement interest_rate =  driver.findElement(By.id("loaninterest"));
		String val2 = interest_rate.getAttribute("value");
		if(val2!=null)
		{
			for(int i=0;i<val2.length();i++)
			{
				interest_rate.sendKeys(Keys.BACK_SPACE);
			}
		}
		interest_rate.sendKeys("9.5");
		
		
		
		WebElement loan_term = driver.findElement(By.id("loanterm"));
		String val3 = loan_term.getAttribute("value");
		if(val3!=null)
		{
			for(int i=0;i<val3.length();i++)
			{
				loan_term.sendKeys(Keys.BACK_SPACE);
			}
		}
		loan_term.sendKeys("1");
		
		//to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

		//EMI IN ADVANCE
		driver.findElement(By.xpath("//label[normalize-space()='EMI in Advance']")).click();
		 
		Thread.sleep(5000);
		//EMI IN ARREARS
		driver.findElement(By.xpath("//label[normalize-space()='EMI in Arrears']")).click();
		
		//Click the plus symbol
		driver.findElement(By.xpath("//*[@id=\"year2024\"]")).click();
		
		String principle=driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[2]")).getText();
		
		String interest=driver.findElement(By.xpath("//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[1]/td[3]")).getText();
		
		//Display the interest amount & principal amount for one month
		System.out.println("prinicipal amount for one month:"+ principle);
		
		System.out.println("Interest  for one month:"+ interest);
		
		//1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month
		//2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;
		//3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator
		//driver.findElement(By.xpath("//*[@id=\"menu-item-dropdown-2696\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu-item-3294\"]/a")).click();
		
		//Select Home Loan
		driver.findElement(By.xpath("//*[@id=\"home-loan\"]/a")).click();
		
		
		WebElement carloan=driver.findElement(By.id("loanamount"));
		String val01=carloan.getAttribute("value");
		if(val01!=null) {
			int v1=val01.length();
			for (int i=0;i<v1;i++) {
				carloan.sendKeys(Keys.BACK_SPACE);
			}
		}
		carloan.sendKeys("1500000");
		Thread.sleep(3000);
		
		WebElement interest1=driver.findElement(By.id("loaninterest"));
		String val02=interest1.getAttribute("value");
		if(val02!=null) {
			int v2=val02.length();
			for (int i=0;i<v2;i++) {
				interest1.sendKeys(Keys.BACK_SPACE);
			}
		}
		interest1.sendKeys("9.5");
		Thread.sleep(3000);
		
		WebElement tenture=driver.findElement(By.id("loanterm"));
		WebElement interest2=driver.findElement(By.id("loaninterest"));
		String val03=interest2.getAttribute("value");
		if(val03!=null) {
			int v3=val03.length();
			for (int i=0;i<v3;i++) {
				tenture.sendKeys(Keys.BACK_SPACE);
			}
		}
		tenture.sendKeys("1");
		Thread.sleep(2000);
		tenture.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,400)", "");
	    /*
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    XSSFSheet sheet= workbook.createSheet("EMI_DATA");
	    
	    WebElement yearOnYearTable=driver.findElement(By.id("monthyear2024"));
	    List <WebElement> rows = yearOnYearTable.findElements(By.tagName("tr"));
	    
	    int rowNum=0;
	    for(WebElement row : rows) {
	    	List <WebElement> cells = row.findElements(By.tagName("td"));
	    	Row excelRow =sheet.createRow(rowNum++);
	    	
	    	int cellNum=0;
	    	for(WebElement cell: cells) {
	    		Cell excelCell=excelRow.createCell(cellNum++);
	    		excelCell.setCellValue(cell.getText());  
	    		
	    	}
	    }
	    try(FileOutputStream outputStream=new FileOutputStream(System.getProperty("user.dir")+"//testdata//EMI_DATA.xlsx")){
	    	workbook.write(outputStream);
	    }catch(IOException e) {
	    	e.printStackTrace();
	    
	    }
	    */
		driver.findElement(By.id("startmonthyear")).click();
		driver.findElement(By.id("year2024")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("monthyear2024"));
	
		XSSFWorkbook wb = new XSSFWorkbook();
		Sheet sheet1 = wb.createSheet("CarTabledata");
		int rowNum = 0;
		List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id=\"emipaymenttable\"]/table"));
		String columnFirst = "//*[@id=\"monthyear2024\"]/td/div/table/tbody/tr[";
		String columnlast = "]/td";
		if (rowNum==0){
			int colNum = 0;
			Row excelRow = sheet1.createRow(rowNum);
			Cell excelCell = excelRow.createCell(colNum);
			colNum++;
			excelCell.setCellValue(driver.findElement(By.id("yearheader")).getText());
			Cell excelCell1 = excelRow.createCell(colNum);
			colNum++;
			excelCell1.setCellValue(driver.findElement(By.id("principalheader")).getText());
			Cell excelCell2 = excelRow.createCell(colNum);
			colNum++;
			excelCell2.setCellValue(driver.findElement(By.id("interestheader")).getText());
			Cell excelCell3 = excelRow.createCell(colNum);
			colNum++;
			excelCell3.setCellValue(driver.findElement(By.id("totalheader")).getText());
			Cell excelCell4 = excelRow.createCell(colNum);
			colNum++;
			excelCell4.setCellValue(driver.findElement(By.id("balanceheader")).getText());
			Cell excelCell5 = excelRow.createCell(colNum);
			colNum++;
			excelCell5.setCellValue(driver.findElement(By.id("paidtodateheader")).getText());
			rowNum++;
			
		}
		for (int i = 1; i <= tableRows.size(); i++) {
			String column = columnFirst + i + columnlast;
				Row excelRow = sheet1.createRow(rowNum);
				int colNum = 0;
				List<WebElement> tablecolumns = driver.findElements(By.xpath(column));
				String columnlasts = "]/td[";
				String last = "]";
				for (int j = 1; j <= tablecolumns.size(); j++) {
					String rows = columnFirst + i + columnlasts + j + last;
					String getText = driver.findElement(By.xpath(rows)).getText();
					Cell excelCell = excelRow.createCell(colNum);
					excelCell.setCellValue(getText);
					colNum++;
				}
				rowNum++;
		}
		try {
			OutputStream fileOut = new FileOutputStream("C:\\Users\\2308938\\eclipse-workspace\\seleniumproject\\OutputStoredDta\\StoredcardataFromExcel.xls");
			wb.write(fileOut);
			wb.close();
			fileOut.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	    

	    
	    //3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator
			
		
		
		
		

	}




	