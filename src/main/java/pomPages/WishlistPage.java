package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	@FindBy(xpath="//span[text()='Play']")
	private WebElement playicon;
	
	@FindBy(xpath="//span[text()='Pause']")
	private WebElement paucseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void playbutton() {
		playicon.click();
		
	}
	public void pausebutton() {
		paucseicon.click();
	}
	public void addtowishlist() {
		addtowishlist.click();
		
	}
	
	

}
