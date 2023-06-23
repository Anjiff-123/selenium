package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	private @FindBy(id = "gender-male")
	WebElement GenderButton;
	
	private @FindBy(name = "FirstName")
	WebElement FirstNameTextField;
	
	private @FindBy(name = "LastName")
	WebElement LastNameTextField;
	
	private @FindBy(id="Email")
	WebElement EmailTextField;
	
	private @FindBy(id="Password")
	WebElement PasswordTextField;
	
	private @FindBy(id="ConfirmPassword")
	WebElement ConfirmPasswordTextField;
	
	private @FindBy(id="register-button")
	WebElement RegisterButton;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		RegisterLink = registerLink;
	}

	public WebElement getGenderButton() {
		return GenderButton;
	}

	public void setGenderButton(WebElement genderButton) {
		GenderButton = genderButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public void setFirstNameTextField(WebElement firstNameTextField) {
		FirstNameTextField = firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		LastNameTextField = lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		EmailTextField = emailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		PasswordTextField = passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		ConfirmPasswordTextField = confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		RegisterButton = registerButton;
	}
	
	
}
