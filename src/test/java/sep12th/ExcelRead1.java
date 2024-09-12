package sep12th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\012Livetech\\jars\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		System.out.println("getLastRowNum : "+ws.getLastRowNum());
		
		System.out.println("PhysicalNumberOfRows : "+ws.getPhysicalNumberOfRows());
		
		
		System.out.println("LastCellNum() : "+ws.getRow(1).getLastCellNum());
		
		System.out.println("PhysicalNumberOfCells : "+ws.getRow(1).getPhysicalNumberOfCells());
		
		System.out.println("End of program...");

	}

}
