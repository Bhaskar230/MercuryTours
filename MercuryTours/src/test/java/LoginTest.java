import java.io.IOException;

import org.testng.annotations.Test;

import Framework.com.Base;
import application.Mercury.LoginPage;


public class LoginTest extends Base{
	
	@Test
	public void logintesting() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.LoginPageMethod();
		
		
	}

}
