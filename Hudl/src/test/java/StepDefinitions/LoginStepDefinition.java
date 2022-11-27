package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	LoginPage login_page;
	MainPage main_page;
	HomePage home_page;
	
	

	@Before
	public void browserSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Hudl\\Hudl\\src\\test\\resources\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--no-sandbox");
		opt.addArguments("--disable-browser-side-navigation ");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.navigate().to("https://www.hudl.com/en_gb");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}

	@Given("User is in main page")
	public void user_is_in_main_page() {
		main_page = new MainPage(driver);
		main_page.validateMainPage();
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() throws InterruptedException {
		main_page.clickLogIn();
	}

	@Then("User is navigated to login page")
	public void user_is_navigated_to_login_page() throws InterruptedException {
		login_page = new LoginPage(driver);
		login_page.validLogIn();
	}

	@When("User enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password)  {
		login_page.enterEmailLogin(email);
		login_page.enterPasswordLogin(password);
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		login_page.clickLogIn();
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		home_page = new HomePage(driver);
		home_page.validateHomePage();
	}
	@Then("User get invalid login error")
	public void user_get_invalid_login_error() throws InterruptedException {
	   login_page.invalidLogin();
	}

}
