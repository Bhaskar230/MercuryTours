import java.io.IOException;

import org.testng.annotations.Test;

import Framework.com.Base;
import application.Mercury.SelectFlight;


public class SelectFlightTest extends Base{
	
	@Test
	public void selectflightTesting() throws IOException, InterruptedException
	{
		SelectFlight sf=new SelectFlight(driver);
		sf.SelectFlightDepart();
		sf.SelectFlightReturn();
		
	}

}
