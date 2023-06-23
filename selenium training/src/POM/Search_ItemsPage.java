package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_ItemsPage {
	public Search_ItemsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement SearchBarTextField;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement SubmitButton;

	public WebElement getSearchBarTextField() {
		return SearchBarTextField;
	}

	public void setSearchBarTextField(WebElement searchBarTextField) {
		SearchBarTextField = searchBarTextField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		SubmitButton = submitButton;
	}
	
	

}
