package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoApplication();
		
		SkillraryDemoApplication d= new SkillraryDemoApplication(driver);
		d.courceButton();
		d.feedbackButton();
		
	}

}
