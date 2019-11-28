import java.io.IOException;

import org.testng.annotations.Test;

import Framework.com.Base;
import application.Mercury.BookaFlight;


public class BookaFlightTest extends Base{
	
	@Test
	public void BookaFlightesting() throws IOException, InterruptedException
	{
		BookaFlight baf=new BookaFlight(driver);
		baf.passengerMethod();
		baf.creditCard();
		baf.billingAdress();
		baf.deliveryAdress();
	}

}
