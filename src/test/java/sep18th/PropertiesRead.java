package sep18th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("D:\\012LivetechWS\\FrameworkAutomation\\config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fis1);
		
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("url"));
		System.out.println(pr.getProperty("implicitWait"));
		

	}

}
