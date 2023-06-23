package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWSPage {
	public ToCheckCpmpanyInfoInFBPageAndSwitchBackToDWSPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement pw;
	
	@FindBy(xpath ="//input[@value='Log in']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//a[text()='Facebook']")
	WebElement fb;

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPw() {
		return pw;
	}

	public void setPw(WebElement pw) {
		this.pw = pw;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public WebElement getFb() {
		return fb;
	}

	public void setFb(WebElement fb) {
		this.fb = fb;
	}
	
	
	
}
