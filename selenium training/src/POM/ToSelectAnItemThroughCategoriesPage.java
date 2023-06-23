package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToSelectAnItemThroughCategoriesPage {
	public ToSelectAnItemThroughCategoriesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[3]")
	WebElement ElectronicsButton;
	
	@FindBy(xpath = "(//img[contains(@alt,'Picture for category Cell phones')])")
	WebElement image;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement cart;

	public WebElement getElectronicsButton() {
		return ElectronicsButton;
	}

	public void setElectronicsButton(WebElement electronicsButton) {
		ElectronicsButton = electronicsButton;
	}

	public WebElement getImage() {
		return image;
	}

	public void setImage(WebElement image) {
		this.image = image;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}
	
	
}
