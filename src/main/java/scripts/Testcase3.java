package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilities;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchtextbox(p.getPropertyFiledata("name"));
		s.searchbutton();
		
		CoreJavaPage c= new CoreJavaPage(driver);
		c.corejavaselenium();
		
		WishlistPage w= new WishlistPage(driver);
		
		WebDriverUtilities driverutilies = new WebDriverUtilities();
		driverutilies.switchFrames(driver);
		w.playbutton();
		Thread.sleep(10000);
		w.pausebutton();
		driverutilies.switchbackFrrame(driver);
		w.addtowishlist();
		
		
		
		
	}

}
