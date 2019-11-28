import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Framework.com.Base;



public class BrowserTesting extends Base{
	
	@BeforeSuite
	public void Driverlaunch()
	{
		DriverConfig("firefox", "http://newtours.demoaut.com/");
	}
	
	@AfterSuite
	public void DriverClose()
	{
		driver.close();
	}

}
