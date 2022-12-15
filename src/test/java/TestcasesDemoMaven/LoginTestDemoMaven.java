package TestcasesDemoMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ResourceMavenDemo.BaseClassOfMavenDemo;
import ResourceMavenDemo.CommonMethods;
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
		/*
		
  SoftAssert assertion=new SoftAssert();
  
  assertion.assertEquals(lpo.EnterActual().getText(),ConstantData.Expected);
  assertion.assertAll(); 
  */
  CommonMethods.Assertions(lpo.EnterActual().getText(), ConstantData.Expected);
	
	}

}