package Framework.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public void DriverConfig(String browsername,String url)
	{
		try {
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "F:\\seleniumnew_-workspace\\MercuryTours\\src\\main\\resources\\Drivers\\chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("incognito");
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				cap.merge(options);
				driver=new ChromeDriver(cap);
				driver.get(url);
				String title=driver.getTitle();
				System.out.println("Browser Title Name is "+title);
				
				
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "F:\\seleniumnew_-workspace\\MercuryTours\\src\\main\\resources\\Drivers\\geckodriver.exe");
				FirefoxOptions options=new FirefoxOptions();
				options.addArguments("--incognito");
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
				cap.merge(options);
				driver=new FirefoxDriver(cap);
				driver.get(url);
				String title=driver.getTitle();
				System.out.println("Browser Title Name is "+title);
			}
			else
			{
				System.out.println("WebDriver Problem");
			}
		} catch (Exception e) {
			System.err.println(e +"WebDriver problem BASE class");
		}
	}
	
	
	public void explicitywaitMethod(WebDriver driver,long inseconds,WebElement element)
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, inseconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.err.println(e+"Webdriverwait exception in Base class");
		}
	}
	
	public void ScreenShotMethod(String screensource) throws IOException
	{
		String screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		File file=OutputType.FILE.convertFromBase64Png(screenshot);
		FileUtils.copyFile(file, new File(screensource), true);
		System.out.println("ScreenShot method sucess");
	}
	

}
