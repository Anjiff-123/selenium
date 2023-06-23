package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAnItemInHomePageToCart{
	public AddAnItemInHomePageToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement AddToCartButton;

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		AddToCartButton = addToCartButton;
	}
}
