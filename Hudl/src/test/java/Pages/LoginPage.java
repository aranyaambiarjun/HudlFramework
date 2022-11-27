package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	private By txtbx_email_login=By.id("email");
	private By txtbx_password_login=By.id("password");
	private By btn_login=By.id("logIn");
	private By txt_invalid=By.className("uni-text");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void validLogIn() throws InterruptedException {
		Thread.sleep(3000);
		//Verifying the navigation to Main Page
		Assert.assertTrue("User is in Main Page",this.driver.getTitle().equals("Log In"));
		Thread.sleep(3000);
		
	}
	
	public void enterEmailLogin(String email) {
		//enter the value in email textbox
		this.driver.findElement(txtbx_email_login).sendKeys(email);
			}
	
	public void enterPasswordLogin(String password) {
		//entering the value in password textbox
		this.driver.findElement(txtbx_password_login).sendKeys(password);
			}
	
	public void clickLogIn() throws InterruptedException {
		Thread.sleep(3000);
		//click on the login button in Login page
		this.driver.findElement(btn_login).click();
	}
	
	public void invalidLogin() throws InterruptedException {
		Thread.sleep(3000);
		//Verfying if the invalid credentials alertbox is displayed
		Assert.assertTrue("Invalid Credentials",this.driver.findElement(txt_invalid).isDisplayed());
	}

}
