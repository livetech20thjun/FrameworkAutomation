package sep18th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\012Livetech\\jars\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//Case1 : modifying an existing cell 
		
		//ws.getRow(2).getCell(1).setCellValue("Cypress");
		
		//case 2: creating a cell in existing row 
		
		//ws.getRow(1).createCell(3).setCellValue(false);
		
		//case 3: creating a new row and cell in it 
		
		ws.createRow(3).createCell(0).setCellValue("Python");
		
		FileOutputStream fos=new FileOutputStream("D:\\012Livetech\\jars\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("End of Program...");
		

	}

}
