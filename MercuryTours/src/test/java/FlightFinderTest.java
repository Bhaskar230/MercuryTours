import java.io.IOException;

import org.testng.annotations.Test;

import Framework.com.Base;
import application.Mercury.FlightFinder;


public class FlightFinderTest extends Base{
	
	@Test
	public void SelectFlighttesting() throws IOException, InterruptedException
	{
		FlightFinder ff=new FlightFinder(driver);
		ff.fightfinder();
	
		
		
		
	}

}
