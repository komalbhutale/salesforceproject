package ResourceMavenDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	

}
