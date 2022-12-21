package stepDefination;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObject.PageObject_LoginPage;
import utilities.ReadConfig;

public class StepForAsseration extends BaseClass {

	
//	@Before (order=1)
	
	
	
	@Before("@sanity")

	public void set_up1() {

		readconfig = new ReadConfig();

		String Browser = readconfig.getBrowser();

		switch (Browser.toLowerCase()) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					"D:\\diff browser\\Chrome\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();

			break;

		case "medge":
			System.setProperty("webdriver.edge.driver",
					"D:\\diff browser\\edgedriver_win64\\neeee\\edgedriver_win64 (3)\\msedgedriver.exe");
			driver = new EdgeDriver();

			break;

		default:
			driver = null;
			break;

		}

	}
	
	/*
//	@Before(order=2)
	@Before("@Regression")
	public void set_up2() {
		
		
	}
	
	
	*/
	
	
	@Given("User Launch Browser")
	public void user_launch_browser() {
		

	
		pageObject = new PageObject_LoginPage(driver);

	}

	@When("User Open the Url {string}")
	public void user_open_the_url(String url) {

		driver.get(url);
	}

	@When("User Enter the email as {string} and Password as {string}")
	public void user_enter_the_email_as_and_password_as(String email, String password) {
		pageObject.emailText(email);
		pageObject.passText(password);

	}

	@When("user click on Login Link")
	public void user_click_on_login_link() {

		pageObject.loginButtonClick();

	}


	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		String ActualTitle = driver.getTitle();
		if (expectedTitle.equals(ActualTitle)) {

			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	
	
	
	/*
	@After
	
	public void screen_shot(Scenario sc) {
		
		if (sc.isFailed()==true) {
			String ScreenshotPath ="C:\\Users\\BusinessComputers.in\\eclipse-workspaceSADA\\Cucumber_Flipkart_project\\ScreenShot\\new";
			Date d = new Date();
			String src = d.toString();
			src=src.replace(" ", "_");
			src=src.replace(":", "-");       
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destiFile = new File(ScreenshotPath+src+".jpg");
			
			try {
				FileHandler.copy(sourceFile, destiFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	*/
	
    @AfterStep
    
    public void screen_shot_test_cases(Scenario sc) {
    	
    	// for taking only failed test cases screenshot we use if condition like
    	
    	if (sc.isFailed()) {
    	 
    		// for taking all test cases screenshot without using if condition
    		
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	
    	sc.attach(screenshot, "image/png", sc.getName());
    
    	}
    	   }

	@When("User enter the searach attribute as {string}")
	public void user_enter_the_searach_attribute_as(String sandals) {
		pageObject.click_on_search_attribute(sandals);

		List<WebElement> opt = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']"));

		System.out.println(opt.size());

		for (int i = 0; i <= opt.size() - 1; i++) {

			System.out.println(opt.get(i).getText());
		}

	}
	
	/*
	@After
	
	public void tear_down() {
		driver.close();
		driver.quit();
	}
	
	
	*/
	
	
	

}
