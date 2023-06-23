package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class VoteTestCasePage {
	public VoteTestCasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//label[text()='Excellent'])")
	WebElement Excellent;
	
	@FindBy(xpath = "(//input[@id='vote-poll-1'])")
	WebElement poll;

	public WebElement getExcellent() {
		return Excellent;
	}

	public void setExcellent(WebElement excellent) {
		Excellent = excellent;
	}

	public WebElement getPoll() {
		return poll;
	}

	public void setPoll(WebElement poll) {
		this.poll = poll;
	}
	
}
