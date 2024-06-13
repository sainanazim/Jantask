package tespkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Pagecls;
import utils.Excelutils;

public class Testcls {

	
   WebDriver driver;
   String base = "https://janasya.com/";
   
   @BeforeTest
   public void set()
   {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(base);
   }
		   
	@Test(enabled = false)
	public void test() throws IOException, InterruptedException
	{
		Pagecls ob = new Pagecls(driver);
		String xl = "G:\\datas.xlsx";
		String sheet = "Sheet1";
		int rowcount = Excelutils.getRowCount(xl, sheet);
		for(int i=1; i<= rowcount;i++)
		{
			String datas = Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.print(datas);
			ob.search(datas);
			Thread.sleep(5000);
		}
	}
	
	@Test
	public void items()
	{
		Pagecls ob = new Pagecls(driver);
		ob.newaa();
	}
}
