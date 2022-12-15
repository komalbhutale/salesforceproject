package TestcasesDemoMaven;

import org.testng.annotations.Test;

import ResourceMavenDemo.BaseClassOfMavenDemo;
import ResourceMavenDemo.ConstantData;
import pageObjectModel.LoginPageObjectMaven;

public class LoginTestDemoMaven extends BaseClassOfMavenDemo {

	@Test
	public void Loginpage() throws Exception {
		BI();
		driver.get("https://login.salesforce.com/?locale=in");

		LoginPageObjectMaven lpo = new LoginPageObjectMaven(driver);

		lpo.EnterUsername().sendKeys(ConstantData.username);
		lpo.EnterPasswors().sendKeys(ConstantData.password);
		lpo.EnterLogin().click();
	
	}

}