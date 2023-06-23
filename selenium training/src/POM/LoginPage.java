package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath = "//a[text()='Log in']")
	WebElement LoginLink;
	
	private @FindBy(xpath = "//input[@id='Email']")
	WebElement EmailTextfield;
	
	private @FindBy(xpath = "//input[@id='Password']")
	WebElement PasswordTextFiled;
	
	private @FindBy(xpath = "//input[@value='Log in']")
	WebElement LoginButton;

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public void setEmailTextfield(WebElement emailTextfield) {
		EmailTextfield = emailTextfield;
	}

	public WebElement getPasswordTextFiled() {
		return PasswordTextFiled;
	}
	
	
	public void setPasswordTextFiled(WebElement passwordTextFiled) {
		PasswordTextFiled = passwordTextFiled;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}
	
}
