package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToSearchandSelectAnItemPage {
	public ToSearchandSelectAnItemPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchbar;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement SubmitButton;
	
	@FindBy(xpath = "(//a[@href='/womens-running-shoe'])[2]")
	WebElement ShoeImage;

	public WebElement getSearchbar() {
		return searchbar;
	}

	public void setSearchbar(WebElement searchbar) {
		this.searchbar = searchbar;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		SubmitButton = submitButton;
	}

	public WebElement getShoeImage() {
		return ShoeImage;
	}

	public void setShoeImage(WebElement shoeImage) {
		ShoeImage = shoeImage;
	}
	
}
