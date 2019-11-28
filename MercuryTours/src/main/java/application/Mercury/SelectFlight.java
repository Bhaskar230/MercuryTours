package application.Mercury;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.com.Base;



public class SelectFlight extends Base{
	
	@FindBy(xpath="//input[@value='Unified Airlines$363$281$11:24']")
	public WebElement depart;
	public void SelectFlightDepart()
	{
		explicitywaitMethod(driver, 3000, depart);
		depart.click();
	}

	@FindBy(xpath="//input[@value='Pangea Airlines$632$282$16:37']")
	public WebElement returncheck;
	@FindBy(xpath="//input[@name='reserveFlights']")
	public WebElement continuefindbutton;
	
	
	public void SelectFlightReturn() throws IOException, InterruptedException
	{
		explicitywaitMethod(driver, 3000, returncheck);
		returncheck.click();
		Thread.sleep(5000);
		ScreenShotMethod("F:\\seleniumnew_-workspace\\MercuryTours\\src\\test\\resources\\ScreenShots\\SelectFlight.png");
		explicitywaitMethod(driver, 3000, continuefindbutton);
		continuefindbutton.click();
	}
	
	public SelectFlight(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
