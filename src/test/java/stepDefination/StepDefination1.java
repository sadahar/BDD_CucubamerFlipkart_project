package stepDefination;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObject.PageObject_LoginPage;

public class StepDefination1 extends BaseClass {


	@Given("Launching The Chrome Browser")
	public void launching_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\diff browser\\Chrome\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		pageObject = new PageObject_LoginPage(driver);

	}

	@When("User Open  Url as {string}")
	public void user_open_url_as(String url) {
		driver.get(url);

	}

	@When("User Enter email as {string} and enter Password as {string}")
	public void user_enter_email_as_and_enter_password_as(String email, String password) {

		pageObject.emailText(email);
		pageObject.passText(password);

	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {

		pageObject.loginButtonClick();
	}


	
	@Then("Page Title {string}")
	public void page_title(String expectedTitle) {
		
		String ActualTitle = driver.getTitle();
		if (expectedTitle.equals(ActualTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

	@When("user click on Become Seller Attribute")
	public void user_click_on_become_seller_attribute() {
		pageObject.BecomeSellerClick();

	}
	
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    
	}


	@When("User Should able to navigate previous Page")
	public void user_should_able_to_navigate_previous_page() {
		driver.navigate().back();

	}

	/*
	 * @When("user click on Login link") public void user_click_on_login_link() {
	 * pageObject.SadashivClick();
	 * 
	 * }
	 * 
	 * @When("user Click on Logout button") public void
	 * user_click_on_logout_button() {
	 * 
	 * }
	 * 
	 * @When("Close browser") public void close_browser() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */

}
