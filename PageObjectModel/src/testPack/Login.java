package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name = "userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	public Logout testLogin()
	{
		userName.sendKeys("mercury");
		pwd.sendKeys("mercury");
		btnLogin.click();
		return PageFactory.initElements(driver, Logout.class);
	}
	
	public BookingTickets testLogin1()
	{
		userName.sendKeys("mercury");
		pwd.sendKeys("mercury");
		btnLogin.click();
		return PageFactory.initElements(driver, BookingTickets.class);
		
	}
	
	

}
