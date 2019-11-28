package application.Mercury;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Framework.com.Base;



public class LoginPage extends Base{

	@FindBy(xpath="//input[@name='userName']")
	public WebElement username;
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	@FindBy(xpath="//input[@name='login']")
	public WebElement loginbutton;

	public void LoginPageMethod() throws IOException, InterruptedException
	{
		username.sendKeys("opensourcecms");
		password.sendKeys("opensourcecms");
		explicitywaitMethod(driver, 3000, loginbutton);
		Thread.sleep(5000);
		ScreenShotMethod("F:\\seleniumnew_-workspace\\MercuryTours\\src\\test\\resources\\ScreenShots\\loginpage.png");
		loginbutton.click();

	}


	

	


	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
