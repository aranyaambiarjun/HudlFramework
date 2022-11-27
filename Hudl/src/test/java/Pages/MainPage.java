package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	protected WebDriver driver;
	private By btn_login=By.linkText("Log in");
	
	public MainPage(WebDriver driver){
	this.driver=driver;	
	}
	
	public void clickLogIn() throws InterruptedException {
		
		Thread.sleep(3000);	
		//Clicking on the Login Button.
		driver.findElement(btn_login).click();
	}
	
	public void validateMainPage() {
		
		//Verifying the nagivation to main page
		Assert.assertTrue("User is in Main Page",this.driver.getTitle().equals("Hudl • Connected solutions for high-performance video and data analysis"));
		
			
	}
	
	
}
