package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	public SkillraryDemoApplication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void courceButton() {
		coursetab.click();
		
	}
	public void feedbackButton() {
		feedbackbtn.click();
		
	}

}
