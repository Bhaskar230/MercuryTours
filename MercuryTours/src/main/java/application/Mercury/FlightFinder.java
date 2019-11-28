package application.Mercury;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Framework.com.Base;



public class FlightFinder extends Base{
	
	@FindBy(xpath="//input[@value='roundtrip']")
	public WebElement radiobutton;
	@FindBy(xpath="//input[@value='Business']")
	public WebElement ServiceClass;
	@FindBy(xpath="//input[@name='findFlights']")
	public WebElement continueButton;
	public void fightfinder() throws IOException, InterruptedException
	{
		explicitywaitMethod(driver, 3000, radiobutton);
		radiobutton.click();
		Select passenger =new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		passenger.selectByVisibleText("1");
		Select departureFrom =new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		departureFrom.selectByVisibleText("London");
		Select OnDepartmonth =new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		OnDepartmonth.selectByValue("12");
		Select arriveein =new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		arriveein.selectByVisibleText("Sydney");
		Select Onarrivemonth =new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		Onarrivemonth.selectByValue("7");
		Select OnDay =new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		OnDay.selectByVisibleText("27");
		explicitywaitMethod(driver, 3000, ServiceClass);
		ServiceClass.click();
		Select Airline =new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		Airline.selectByVisibleText("Unified Airlines");
		Thread.sleep(4030);
		ScreenShotMethod("F:\\seleniumnew_-workspace\\MercuryTours\\src\\test\\resources\\ScreenShots\\fightFinder.png");
		explicitywaitMethod(driver, 3000, continueButton);
		continueButton.click();



	}

	
	public FlightFinder(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
