package testPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingTickets {
	WebDriver driver;

	public BookingTickets(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name="tripType")
	List<WebElement> tripType;
	
	@FindBy(name="fromPort")
	WebElement fromPort;
	
	@FindBy(name="airline")
	WebElement airline;
	
	@FindBy(name="servClass")
	List<WebElement> servClass;
	
	public Logout BookingTic()
	{
		for(WebElement t:tripType)
		{
			if(t.getAttribute("value").equals("oneway"))
			{
				t.click();
			}
		}
		
		for(WebElement c:servClass)
		{
			if(c.getAttribute("value").equals("First"))
			{
				c.click();
			}
		}
		
		Select s = new Select(fromPort);
		s.selectByVisibleText("London");
		
		Select d = new Select(airline);
		d.selectByVisibleText("Blue Skies Airlines");
		
		return PageFactory.initElements(driver, Logout.class);
	}

	}