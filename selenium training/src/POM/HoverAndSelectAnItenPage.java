package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverAndSelectAnItenPage {
	public HoverAndSelectAnItenPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	WebElement computers;
	
	@FindBy(xpath = "//img[@alt='Picture of Build your own computer']")
	WebElement Text;

	public WebElement getComputers() {
		return computers;
	}

	public void setComputers(WebElement computers) {
		this.computers = computers;
	}

	public WebElement getText() {
		return Text;
	}

	public void setText(WebElement text) {
		Text = text;
	}
	
}
