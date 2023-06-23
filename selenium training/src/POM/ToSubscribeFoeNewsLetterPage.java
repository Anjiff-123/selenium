package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToSubscribeFoeNewsLetterPage {
	public ToSubscribeFoeNewsLetterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//input[@id='newsletter-email'])")
	WebElement NewsLetterButton;
	
	@FindBy(xpath = "(//input[@id='newsletter-subscribe-button'])")
	WebElement SubscribeButton;

	public WebElement getNewsLetterButton() {
		return NewsLetterButton;
	}

	public void setNewsLetterButton(WebElement newsLetterButton) {
		NewsLetterButton = newsLetterButton;
	}

	public WebElement getSubscribeButton() {
		return SubscribeButton;
	}

	public void setSubscribeButton(WebElement subscribeButton) {
		SubscribeButton = subscribeButton;
	}
	
}
