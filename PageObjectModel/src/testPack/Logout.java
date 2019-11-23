package testPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {

	@FindBy(linkText="SIGN-OFF")
	WebElement lnkSignOff;
	
	
	public void testLogout()
	{
		lnkSignOff.click();
	}
}
