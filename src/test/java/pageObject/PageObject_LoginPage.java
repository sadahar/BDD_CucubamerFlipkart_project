package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_LoginPage {

	WebDriver ldriver;
	WebDriver driver;

	public PageObject_LoginPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;
	@FindBy(xpath = "(//span[text()='Become a Seller'])[1]")
	private WebElement becomeSeller;
	@FindBy(xpath = "//div [text()='Sadashiv']")
	private WebElement sadashivClick;

	@FindBy(xpath = "//input [@type='text']")
	private WebElement search;
	/*
	 * @FindBy (xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement email;
	 * 
	 * @FindBy (xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement email;
	 * 
	 * @FindBy (xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement email;
	 * 
	 * @FindBy (xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement email;
	 * 
	 */

	public void emailText(String e) {
		email.sendKeys(e);
	}

	public void passText(String p) {
		password.sendKeys(p);
	}

	public void loginButtonClick() {
		loginbutton.click();
	}

	public void click_on_search_attribute(String iteams) {
		search.sendKeys(iteams);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BecomeSellerClick() {

		becomeSeller.click();
	}

	public void SadashivClick() {
		sadashivClick.click();
		sadashivClick.click();
	}

}
