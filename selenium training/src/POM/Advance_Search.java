package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Advance_Search {
	public Advance_Search(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement SearchBar;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement SearchButton;
	
	@FindBy(xpath = "(//input[@id='As'])")
	WebElement As;
	
	@FindBy(xpath = "(//select[@id='Cid'])")
	WebElement cid;
	
	@FindBy(xpath = "(//select[@id='Mid'])")
	WebElement mid;
	
	@FindBy(id="Pf")
	WebElement pf;
	
	@FindBy(id = "Pt")
	WebElement pt;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	WebElement SubmitButton;

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		SearchBar = searchBar;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		SearchButton = searchButton;
	}

	public WebElement getAs() {
		return As;
	}

	public void setAs(WebElement as) {
		As = as;
	}

	public WebElement getCid() {
		return cid;
	}

	public void setCid(WebElement cid) {
		this.cid = cid;
	}

	public WebElement getMid() {
		return mid;
	}

	public void setMid(WebElement mid) {
		this.mid = mid;
	}

	public WebElement getPf() {
		return pf;
	}

	public void setPf(WebElement pf) {
		this.pf = pf;
	}

	public WebElement getPt() {
		return pt;
	}

	public void setPt(WebElement pt) {
		this.pt = pt;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		SubmitButton = submitButton;
	}
}
