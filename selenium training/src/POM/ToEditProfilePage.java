package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToEditProfilePage {
	public ToEditProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement pw;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginbutton;
	
	@FindBy(xpath = "(//a[@href='/customer/info'])[1]")
	WebElement costomerinfo;
	
	@FindBy(id = "LastName")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;

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

	public WebElement getCostomerinfo() {
		return costomerinfo;
	}

	public void setCostomerinfo(WebElement costomerinfo) {
		this.costomerinfo = costomerinfo;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}
}
