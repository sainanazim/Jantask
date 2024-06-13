package pagepkg;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagecls {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"Search-In-Modal\"]")
	WebElement searchfield;
	
	@FindBy(xpath = "//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")
	WebElement newa;
	
	@FindBy(xpath = "//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div")
	WebElement itemdrop;
	
	@FindBy(xpath = "//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li/span")
	List<WebElement> itemnos;
	
	public Pagecls(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
	public void search(String datas)
	{
		searchfield.clear();
		searchfield.sendKeys(datas,Keys.ENTER);
	}

	
	public void newaa()
	{
		newa.click();
		itemdrop.click();
		for(WebElement ele : itemnos)
		{
		   String text =	ele.getText();
		   if(text.equals("10"))
		   {
			   ele.click();
		   }
		}
	}

}
