package pack9;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\file.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row=sheet.createRow(0);
		
		row.createCell(0).setCellValue("welcome");
		
		row.createCell(1).setCellValue("wel");
		
		row.createCell(2).setCellValue("welcome.....");
		
		row.createCell(3).setCellValue("value");
		
		row.createCell(4).setCellValue("name");
	
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done");
	}	

}
