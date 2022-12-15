package TestcasesDemoMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ResourceMavenDemo.BaseClassOfMavenDemo;
import ResourceMavenDemo.CommonMethods;
import ResourceMavenDemo.ConstantData;
import pageObjectModel.LoginPageObjectMaven;
import pageObjectModel.SignUpDemoObject;

public class SignUpDemoMaven extends BaseClassOfMavenDemo {
	@Test
	public void SignUpPage() throws Exception {

		BI();
		driver.get("https://login.salesforce.com/?locale=in");

		LoginPageObjectMaven lpo = new LoginPageObjectMaven(driver);
		lpo.EnterTryForFree().click();

		Thread.sleep(6000);
///////////////////////////////////////////////////////////////////////////////////////////////
		
		SignUpDemoObject sdm = new SignUpDemoObject(driver);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		sdm.EnterFirstName().sendKeys(ConstantData.FirstName);
		sdm.EnterLastname().sendKeys(ConstantData.LastName);
		sdm.EnterWorkEmail().sendKeys(ConstantData.UserEmail);
		Thread.sleep(2000);
		sdm.EnterCompany().sendKeys(ConstantData.UserCompanyName);
		sdm.EnterPhone().sendKeys(ConstantData.UserPhone);

		/*
		 * Select s = new Select(sdm.EnterJobTitle());
		 
		Thread.sleep(2000);
		s.selectByIndex(4);
		Select s1 = new Select(sdm.EnterEmployee());
		Thread.sleep(2000);
		s1.selectByIndex(1);
		Select s2 = new Select(sdm.EnterCountry());
		s2.selectByVisibleText("Singapore");
		Select s3 = new Select(sdm.EnterState());
		s3.selectByIndex(1);
		*/
		CommonMethods.StaticDropdownByIndex(sdm.EnterJobTitle(), 3);
		CommonMethods.StaticDropdownByIndex(sdm.EnterEmployee(), 1);
		Thread.sleep(2000);
		CommonMethods.StaticDropdownByText(sdm.EnterCountry(), "Singapore" );
		CommonMethods.StaticDropdownByIndex(sdm.EnterState(), 1);

		sdm.EnterCheckbox().click();
		sdm.EnterStartMyTrial().click();
		
		
		

	}

}