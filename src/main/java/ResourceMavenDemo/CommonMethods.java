package ResourceMavenDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	public static void StaticDropdownByIndex(WebElement dropdown,int index) {
		
		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void StaticDropdownByText(WebElement dropdown,String Text) {
		Select s=new Select(dropdown);
		s.selectByVisibleText(Text);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void Assertions(String Actual,String Expected) {
SoftAssert assert1=new SoftAssert();
assert1.assertEquals( Actual,Expected );
}
}