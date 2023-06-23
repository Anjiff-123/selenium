package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToSelectAnItemThroughSortByPosition {
	public ToSelectAnItemThroughSortByPosition(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	WebElement didgitaldownloads;
	
	@FindBy(xpath = "(//img[@alt='Picture of Music 2'])[1]")
	WebElement image;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement cart;
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	WebElement products;

	public WebElement getProducts() {
		return products;
	}

	public void setProducts(WebElement products) {
		this.products = products;
	}

	public WebElement getDidgitaldownloads() {
		return didgitaldownloads;
	}

	public void setDidgitaldownloads(WebElement didgitaldownloads) {
		this.didgitaldownloads = didgitaldownloads;
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
