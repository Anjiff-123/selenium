package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToSearchAnItem {
	public  ToSearchAnItem(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement searchbutton;
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}

	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}

	public void setSearchbar(WebElement searchbar) {
		this.searchbar = searchbar;
	}
	
	
	
}
