package selenium.com;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExcelHandling {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis=new FileInputStream("D://excel");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		System.out.println(pobj.getProperty("naveen"));
		System.out.println(pobj.getProperty("kumar"));
		System.out.println(pobj.getProperty("reddy"));

	}

}