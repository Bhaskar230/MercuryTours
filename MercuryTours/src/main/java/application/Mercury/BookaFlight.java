package application.Mercury;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Framework.com.Base;



public class BookaFlight extends Base{
	
	@FindBy(xpath="//input[@name='passFirst0']")
	public WebElement firstName;
	@FindBy(xpath="//input[@name='passLast0']")
	public WebElement lastName;
	public void passengerMethod()
	{
		firstName.sendKeys("Bala");
		lastName.sendKeys("Bhaskar");
		Select meal=new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		meal.selectByVisibleText("Vegetarian");
	}
	
	@FindBy(xpath="//input[@name='creditnumber']")
	public WebElement creditNumber;
	@FindBy(xpath="//input[@name='cc_frst_name']")
	public WebElement creditfName;
	@FindBy(xpath="//input[@name='cc_mid_name']")
	public WebElement creditmname;
	@FindBy(xpath="//input[@name='cc_last_name']")
	public WebElement creditlname;
	public void creditCard()
	{
		Select cardtype=new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
		cardtype.selectByVisibleText("MasterCard");
		creditNumber.sendKeys("09876564312");
		creditfName.sendKeys("Bala");
		creditmname.sendKeys("Bhaskar");
		creditlname.sendKeys("G");
		
	}
	
	@FindBy(xpath="//input[@name='billAddress1']")
	public WebElement billaddress;
	@FindBy(xpath="//input[@name='billCity']")
	public WebElement billcity;
	@FindBy(xpath="//input[@name='billState']")
	public WebElement billstate;
	@FindBy(xpath="//input[@name='billZip']")
	public WebElement billzip;
	public void billingAdress()
	{
		billaddress.clear();
		billaddress.sendKeys("126A-57");
		billcity.clear();
		billcity.sendKeys("visakhapatnam");
		billstate.clear();
		billstate.sendKeys("Andhrapradesh");
		billzip.clear();
		billzip.sendKeys("530024");
		Select billcountry=new Select(driver.findElement(By.xpath("//select[@name='billCountry']")));
		billcountry.selectByVisibleText("INDIA");
		
	}
	@FindBy(xpath="//input[@name='delAddress1']")
	public WebElement delAddress1;
	@FindBy(xpath="//input[@name='delCity']")
	public WebElement delCity;
	@FindBy(xpath="//input[@name='delState']")
	public WebElement delState;
	@FindBy(xpath="//input[@name='delZip']")
	public WebElement delZip;
	@FindBy(xpath="//input[@type='image']")
	public WebElement purcasebutton;
	public void deliveryAdress() throws IOException, InterruptedException
	{
		delAddress1.clear();
		delAddress1.sendKeys("126B-527,SysngeryColony");
		delCity.clear();
		delCity.sendKeys("fornodo");
		delState.clear();
		delState.sendKeys("Syndey");
		delZip.clear();
		delZip.sendKeys("001567");
		Select delCountry=new Select(driver.findElement(By.xpath("//select[@name='delCountry']")));
		delCountry.selectByVisibleText("AUSTRALIA");
		Thread.sleep(4000);
		ScreenShotMethod("F:\\seleniumnew_-workspace\\MercuryTours\\src\\test\\resources\\ScreenShots\\beforesecurePurchase.png");
		explicitywaitMethod(driver, 3000, purcasebutton);
		purcasebutton.click();
		Thread.sleep(5000);
		ScreenShotMethod("F:\\seleniumnew_-workspace\\MercuryTours\\src\\test\\resources\\ScreenShots\\aftersecurePurchase.png");
		
	}
	
	public BookaFlight(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
