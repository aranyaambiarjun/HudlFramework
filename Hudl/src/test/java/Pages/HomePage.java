package Pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage {

	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void validateHomePage() throws InterruptedException {
		
		Thread.sleep(3000);
		//Verify the navigation to HomePage
		Assert.assertTrue("User is in Home Page",this.driver.getTitle().equals("Home - Hudl"));
		Thread.sleep(3000);
	}
}
